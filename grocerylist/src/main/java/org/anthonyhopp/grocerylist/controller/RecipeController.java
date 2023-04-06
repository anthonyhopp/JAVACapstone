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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//This handles all the mappings for the pages related to recipes


@Controller
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;
	//List<Recipe> recipes = new ArrayList();
	
    @PostMapping("/saveRecipe")
    public String submitForm(@ModelAttribute Recipe recipe) {
        recipeRepository.save(recipe);
        return "redirect:/allRecipes";
    }
    
    @Autowired
    private RecipeService recipeService;
    
	@GetMapping({"/allRecipes"})
	public ModelAndView getAllRecipes() {
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("recipes", recipeRepository.findAll());
		return mav;
	}
    
    @GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Integer recipeId) {
		ModelAndView mav = new ModelAndView("recipes");
		Recipe recipe = recipeRepository.findById(recipeId).get();
		mav.addObject("recipe", recipe);
		return mav;
	}
    
	@GetMapping("/deleteRecipe/{recipeId}")
    public String deleteRecipe(@PathVariable(value = "recipeId") Integer recipeId) {
        this.recipeRepository.deleteById(recipeId);
        return "redirect:/allRecipes";
    }

}