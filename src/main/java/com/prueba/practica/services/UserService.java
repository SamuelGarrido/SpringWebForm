
package com.prueba.practica.services;

import com.prueba.practica.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.practica.repository.UsersRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private  UsersRepository repository;
    
    public void saveUser(User user){
        repository.save(user);
    }
    public List<User> getUsers(){
        return repository.findAll();
    }
    
    public List <User> processUser(List <Integer> ids){
        List<User> users =repository.findAllById(ids);
        
        for (User user : users){ 
            user.setProcessed(true);
        }
        repository.saveAll(users);
        return users;
    }
}
