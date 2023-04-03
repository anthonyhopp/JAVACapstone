package org.anthonyhopp.grocerylist.service;

import org.anthonyhopp.grocerylist.entity.Recipe;
import org.anthonyhopp.grocerylist.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findByRecipeName(String recipeName) {
        
    	return recipeRepository.findByRecipeName(recipeName);
    }
}