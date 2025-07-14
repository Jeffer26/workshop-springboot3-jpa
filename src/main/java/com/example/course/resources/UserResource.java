package com.example.course.resources;

import com.example.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//essa classe é um recurso web que é implementada por um controlador Rest.
@RequestMapping(value = "/users")//dar nome para o recurso.
public class UserResource {

    @GetMapping//para indicar que esse método responde a requisição do tipo GET do HTTP.
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
