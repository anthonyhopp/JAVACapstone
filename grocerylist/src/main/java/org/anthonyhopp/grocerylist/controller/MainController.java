package org.anthonyhopp.grocerylist.controller;


import org.anthonyhopp.grocerylist.entity.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    
    @GetMapping("/contactUs")
    public String contactPage(Model model){
    	Contact contact = new Contact();
    	model.addAttribute("contact", contact);
    	return "contactUs";
    }
    
    @GetMapping("/recipes")
    public String recipes() {
    	return "recipes";
    }
    
    @GetMapping("/instructions")
    public String instructions() {
    	return "instructions";
    }
}