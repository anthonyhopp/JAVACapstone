package org.anthonyhopp.grocerylist.repository;

import org.anthonyhopp.grocerylist.entity.Instructions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionsRepository extends JpaRepository<Instructions, Integer> {

    
}
