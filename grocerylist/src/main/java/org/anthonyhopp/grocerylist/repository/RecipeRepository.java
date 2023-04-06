package org.anthonyhopp.grocerylist.repository;

import java.util.List;


import org.anthonyhopp.grocerylist.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
  
    List<Recipe> findByRecipeName(@Param("recipeName") String recipeName);



	
	
   
}
