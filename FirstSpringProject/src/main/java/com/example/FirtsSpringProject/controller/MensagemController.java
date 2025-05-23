package com.example.FirtsSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FirtsSpringProject.service.MensagemService;



@RestController
@RequestMapping ("/v1")

public class MensagemController {
    
    private final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String Mensagem() {
        return mensagemService.EnviarMensagem();
    }
}
