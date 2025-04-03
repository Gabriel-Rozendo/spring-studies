package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/ola")
    public String mensagem() {
        return "Olá, Mundo!";
    }

    @GetMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem-vindo(a) " + nome;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Seja bem-vindo(a)";
    }
}
