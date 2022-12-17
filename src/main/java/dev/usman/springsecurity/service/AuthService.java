package dev.usman.springsecurity.service;

import dev.usman.springsecurity.model.Customer;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    public ResponseEntity addCustomer(Customer customer);
    
}
