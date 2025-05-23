package com.example.FirtsSpringProject.service;

import org.springframework.stereotype.Service;
import com.example.FirtsSpringProject.repository.MensagemRepository;


@Service
public class MensagemService {
    
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String EnviarMensagem() {
        return mensagemRepository.EnviarMensagem();
    }


}
