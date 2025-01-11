package com.gaos.desafio_romario.repository;

import com.gaos.desafio_romario.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
