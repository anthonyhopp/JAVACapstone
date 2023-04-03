package org.anthonyhopp.grocerylist.repository;

import org.anthonyhopp.grocerylist.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
