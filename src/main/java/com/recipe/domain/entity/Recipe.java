package com.recipe.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe {

    private Integer recipeId;

    private String recipeName;

    private String description;
}
