package com.recipe.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeSearch {

    private Integer recipeId;

    private String recipeName;

    private String description;

    private String ingredientName;

    private String quantity;
}
