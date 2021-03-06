
package com.prueba.practica.controllers;

import com.prueba.practica.models.User;
import com.prueba.practica.services.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    private UserService service;
    
    @PostMapping("/Process")
    public ResponseEntity<List<User>> processUsers(@RequestBody ArrayList<Integer> ids){
        
        List<User> userResponse = service.processUser(ids);
    
        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }
    @GetMapping
    public List<User> getUsers(){
        
       List<User> userResponse = service.getUsers();
       return userResponse;
    }
    @PostMapping
    public void createUser(@RequestBody User user){
        service.saveUser(user);
    }
    
}
