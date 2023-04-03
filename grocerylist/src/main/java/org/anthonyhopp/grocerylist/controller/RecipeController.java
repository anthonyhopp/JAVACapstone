package org.anthonyhopp.grocerylist.controller;

import java.util.ArrayList;
import java.util.List;

import org.anthonyhopp.grocerylist.entity.Recipe;
import org.anthonyhopp.grocerylist.repository.RecipeRepository;
import org.anthonyhopp.grocerylist.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;
	List<Recipe> recipes = new ArrayList();
	
    @PostMapping("/recipes")
    public String submitForm(@ModelAttribute Recipe recipe) {
        recipeRepository.save(recipe);
        return "index";
    }
    
    @Autowired
    private RecipeService recipeService;
    
    @PostMapping("/s")
    public String postRecipe(String recipeName) {
    	recipes = recipeService.findByRecipeName(recipeName);
    	System.out.println(recipes);
    	return "redirect:/s";
    }

    @GetMapping("/s")
    public String getRecipe(Model model) {
    	model.addAttribute("recipes", recipes);
    	System.out.println(recipes);
    	return "search";
    }
    
  /*  @GetMapping("/search")
    public String searchRecipes(@RequestParam(value = "recipeName", required = false) String recipeName, Model model) {
        if (recipeName != null && !recipeName.trim().isEmpty()) {
            model.addAttribute("recipeName", recipeName);
        	recipes = recipeService.findByRecipeName(recipeName);
            model.addAttribute("recipes", recipes);
        }
        
        return "search";
    
    }
    */
    
   /* @GetMapping("/search")
    public String searchResults(@RequestParam(value = "recipes") List<Recipe> recipes, Model model) {
    	model.addAttribute("recipes", recipes);
    	return "searchResults";
    } */
}