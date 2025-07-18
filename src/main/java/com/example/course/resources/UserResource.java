package com.example.course.resources;

import com.example.course.entities.User;
import com.example.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//essa classe é um recurso web que é implementada por um controlador Rest.
@RequestMapping(value = "/users")//dar nome para o recurso.
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping//para indicar que esse método responde a requisição do tipo GET do HTTP.
    public ResponseEntity<List<User>> findAll(){

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
