package org.anthonyhopp.grocerylist.controller;

import org.anthonyhopp.grocerylist.entity.Recipe;
import org.anthonyhopp.grocerylist.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;
	
    @PostMapping("/recipes")
    public String submitForm(@ModelAttribute Recipe recipe) {
        recipeRepository.save(recipe);
        return "index";
    }
}
