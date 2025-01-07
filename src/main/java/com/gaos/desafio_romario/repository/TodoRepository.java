package com.gaos.desafio_romario.repository;

import com.gaos.desafio_romario.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
