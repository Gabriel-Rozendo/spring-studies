package br.com.projeto.api.controller;

import br.com.projeto.api.model.PessoaModel;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/pessoa")
    public PessoaModel pessoa(@RequestBody PessoaModel pessoaModel) {
        return pessoaModel;
    }
}
