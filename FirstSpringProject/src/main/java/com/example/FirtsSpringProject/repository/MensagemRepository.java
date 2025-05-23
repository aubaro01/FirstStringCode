package com.example.FirtsSpringProject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String EnviarMensagem(){
        return "Mensagem do Repositorio";
    }
}
