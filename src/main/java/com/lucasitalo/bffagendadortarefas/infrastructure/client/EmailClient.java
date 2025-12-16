package com.lucasitalo.bffagendadortarefas.infrastructure.client;

import com.lucasitalo.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.lucasitalo.bffagendadortarefas.business.dto.in.LoginRequestDTO;
import com.lucasitalo.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import com.lucasitalo.bffagendadortarefas.business.dto.in.UsuarioDTORequest;
import com.lucasitalo.bffagendadortarefas.business.dto.out.EnderecoDTOResponse;
import com.lucasitalo.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.lucasitalo.bffagendadortarefas.business.dto.out.TelefoneDTOResponse;
import com.lucasitalo.bffagendadortarefas.business.dto.out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "notificacao", url = "${notificacao.url}")

public interface EmailClient {

    @PostMapping
    void enviarEmail(@RequestBody TarefasDTOResponse dto);

    }


