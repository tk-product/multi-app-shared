package com.recipe.domain.mapper;

import com.recipe.domain.entity.Recipe;

public interface RecipeMapper {

    Recipe findById(Integer recipeId);

    int insert(Recipe recipe);
}
