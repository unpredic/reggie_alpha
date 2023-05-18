package com.example.reggie_alpha.filter;

import com.alibaba.fastjson.JSON;
import com.example.reggie_alpha.common.R;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import java.io.IOException;


@Slf4j
@WebFilter(filterName = "LoginCheckFilter", urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    private static AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();

        log.info("拦截到请求：{}", requestURI);

        String[] urls = {
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**"
        };

        // 不需要处理，直接放行
        if (check(urls, requestURI)) {
            log.info("本次请求无需处理：{}", requestURI);
            filterChain.doFilter(request, response);
            return;
        }
        // 需要拦截处理
        // 如果登录，直接放行
        if (request.getSession().getAttribute("employee") != null) {
            log.info("用户已登陆：{}", request.getSession().getAttribute("employee"));
            filterChain.doFilter(request, response);
            return;
        }
        log.info("用户未登录");
        // 如果没登陆，跳转到登陆界面
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }

    public boolean check(String[] urls, String requestURI) {
        for (String url : urls) {
            if (antPathMatcher.match(url, requestURI)) return true;
        }
        return false;
    }

}
