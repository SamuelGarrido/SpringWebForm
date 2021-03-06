package com.prueba.practica;

import com.prueba.practica.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.prueba.practica.repository.UsersRepository;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.prueba.practica"})
public class PracticaApplication {

    private static final Logger log = LoggerFactory.getLogger(PracticaApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);
    }
    
  @Bean
  public CommandLineRunner demo(UsersRepository repository) {
        
      return (args) -> {
      repository.save(new User("Jack", "Bauer"));
      repository.save(new User("Chloe", "O'Brian"));
      repository.save(new User("Kim", "Bauer"));
      repository.save(new User("David", "Palmer"));
      repository.save(new User("Michelle", "Dessler"));
      log.info("Datos de prueba carga 2");
      };
      
  }

}
