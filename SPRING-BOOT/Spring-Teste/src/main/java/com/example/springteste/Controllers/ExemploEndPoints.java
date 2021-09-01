package com.example.springteste.Controllers;

import com.example.springteste.Model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploEndPoints {

    @GetMapping("/{nome}/{sobrenome}")
    public String nomePessoa(@PathVariable String nome, @PathVariable String sobrenome){
        return "Meu nome é " +nome + " " + sobrenome;
    }

    @GetMapping("/inicial")
    public String nomePessoa2(@RequestParam String nome, @RequestParam String sobrenome){
        return nome+ " " +sobrenome;
    }

    @GetMapping("/numero")
    public Integer testeComNumero(@RequestParam Integer numero){
        return numero;
    }

    @GetMapping("/pessoa")
    public Pessoa retornaPessoa(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam Integer idade){
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade);
        return pessoa;
    }

}
