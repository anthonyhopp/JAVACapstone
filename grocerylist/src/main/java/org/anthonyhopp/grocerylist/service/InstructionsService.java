package org.anthonyhopp.grocerylist.service;

import org.anthonyhopp.grocerylist.repository.InstructionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructionsService {
    private final InstructionsRepository instructionsRepository;

    @Autowired
    public InstructionsService(InstructionsRepository instructionsRepository) {
        this.instructionsRepository = instructionsRepository;
    }

}
