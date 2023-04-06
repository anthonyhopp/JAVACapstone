package org.anthonyhopp.grocerylist.service;

import org.anthonyhopp.grocerylist.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}