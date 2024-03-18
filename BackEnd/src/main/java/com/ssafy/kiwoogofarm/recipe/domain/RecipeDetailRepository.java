package com.ssafy.kiwoogofarm.recipe.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeDetailRepository extends JpaRepository<RecipeDetail, Long> {
    List<RecipeDetail> findAllByRecipeId(Long recipeId);
//    List<RecipeDetail> findAllByRecipeNameContaining(String keyword);
}
