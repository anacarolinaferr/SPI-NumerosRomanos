package com.example.springteste.Model;

import lombok.Data;

@Data
public class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
}
