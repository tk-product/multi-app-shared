package com.recipe.domain.mapper;

import com.recipe.domain.entity.Ingredient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IngredientMapper {

    Ingredient findById(Integer ingredientId);

    Ingredient findByName(String name);

    int insert(Ingredient ingredient);
}
