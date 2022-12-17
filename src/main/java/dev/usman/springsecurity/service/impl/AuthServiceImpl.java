package dev.usman.springsecurity.service.impl;

import dev.usman.springsecurity.model.Customer;
import dev.usman.springsecurity.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dev.usman.springsecurity.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity addCustomer(Customer customer) {
        ResponseEntity response = null;
        try {
            String hashPassword = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(hashPassword);
            Customer result = customerRepository.save(customer);
            if (result.getId() > 0) {
                response = ResponseEntity.status(HttpStatus.CREATED).body(result);
            }
        } catch (Exception e) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception accoured!" + e.getMessage());
        }
        return response;
    }

}
