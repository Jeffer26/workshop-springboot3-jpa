package com.example.course.resources;

import com.example.course.entities.Category;
import com.example.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//essa classe é um recurso web que é implementada por um controlador Rest.
@RequestMapping(value = "/categories")//dar nome para o recurso.
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping//para indicar que esse método responde a requisição do tipo GET do HTTP.
    public ResponseEntity<List<Category>> findAll(){

        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
