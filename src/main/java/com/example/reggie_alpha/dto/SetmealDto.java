package com.example.reggie_alpha.dto;

import com.example.reggie_alpha.entity.Setmeal;
import com.example.reggie_alpha.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
