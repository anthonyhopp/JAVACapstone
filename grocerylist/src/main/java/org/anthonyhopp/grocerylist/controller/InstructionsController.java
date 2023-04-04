package org.anthonyhopp.grocerylist.controller;

import org.anthonyhopp.grocerylist.entity.Instructions;
import org.anthonyhopp.grocerylist.repository.InstructionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InstructionsController {
    
    @Autowired
    private InstructionsRepository instructionsRepository; 
    
    @PostMapping("/instructions")
    public String instructions(@ModelAttribute Instructions instructions) {
        instructionsRepository.save(instructions);
        return "index";
    }
    
}