package br.com.ebac.animais_service.controllers;

import br.com.ebac.animais_service.entidades.Funcionario;
import br.com.ebac.animais_service.repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository){
        this.repository = repository;
    }
}
