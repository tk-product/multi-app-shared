package com.recipe.domain.mapper;

import com.recipe.domain.entity.RecipeIngredient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecipeIngredientMapper {

    List<RecipeIngredient> findByRecipeId(Integer recipeId);

    int insert(RecipeIngredient recipeIngredient);
}
