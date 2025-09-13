package com.recipe.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeIngredient {

    private Integer recipeId;

    private Integer ingredientId;

    private String ingredientName;

    private String quantity;
}