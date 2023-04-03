package org.anthonyhopp.grocerylist.repository;

import org.anthonyhopp.grocerylist.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
