package com.gaos.desafio_romario.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="todos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private boolean realizado;
    private int prioridade;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
