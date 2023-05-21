package com.example.reggie_alpha.dto;

import com.example.reggie_alpha.entity.Dish;
import com.example.reggie_alpha.entity.DishFlavor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
