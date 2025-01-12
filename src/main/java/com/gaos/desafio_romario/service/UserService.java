package com.gaos.desafio_romario.service;

import com.gaos.desafio_romario.entity.User;
import com.gaos.desafio_romario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> list(){
        return userRepository.findAll();
    }

    public Optional<User> findById(long id){
        return userRepository.findById(id);
    }

    public List<User> findByNome(String nome){
        return userRepository.findByNome(nome);
    }
    public List<User> create(User user){
        userRepository.save(user);
        return list();
    }

    public List<User> update(User user){
        userRepository.save(user);
        return list();
    }

    public List<User> delete(long id){
        userRepository.deleteById(id);
        return list();
    }
}
