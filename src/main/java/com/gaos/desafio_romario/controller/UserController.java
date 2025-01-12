package com.gaos.desafio_romario.controller;

import com.gaos.desafio_romario.entity.User;
import com.gaos.desafio_romario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> list(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.list());
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<List<User>> create(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @PutMapping
    public ResponseEntity<List<User>> update(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<List<User>> delete(@PathVariable("id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.delete(id));
    }
}
