package com.gaos.desafio_romario.repository;

import com.gaos.desafio_romario.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByNome(String nome);
}
