package com.lucasitalo.bffagendadortarefas.business;


import com.lucasitalo.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.lucasitalo.bffagendadortarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }

}
