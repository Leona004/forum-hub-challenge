package model;

public class Usuario package com.alura.forumhub.model;

import jakarta.persistence.*;
        import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @OneToMany(mappedBy = "autor")
    private List<Topico> topicos;

    // Getters e setters
}
{
}
