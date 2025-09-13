package com.recipe.domain.mapper;

import com.recipe.domain.entity.RecipeSearch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecipeSearchMapper {

    List<RecipeSearch> findByWord(@Param("word") String word);

    RecipeSearch findById(@Param("recipeId") Integer recipeId);
}
