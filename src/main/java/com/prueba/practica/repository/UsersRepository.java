
package com.prueba.practica.repository;

import com.prueba.practica.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    User findById(int ids);   
}


