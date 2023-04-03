package org.anthonyhopp.grocerylist.controller;

import org.anthonyhopp.grocerylist.entity.Contact;
import org.anthonyhopp.grocerylist.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    
    @Autowired
    private ContactRepository contactRepository; 
    
    @PostMapping("/contactUs")
    public String submitForm(@ModelAttribute Contact contact) {
        contactRepository.save(contact);
        return "index";
    }
    
}
