package com.lucasitalo.bffagendadortarefas.business;


import com.lucasitalo.bffagendadortarefas.business.dto.in.TarefasDTORequest;
import com.lucasitalo.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.lucasitalo.bffagendadortarefas.business.enums.StatusNotificacaoEnum;
import com.lucasitalo.bffagendadortarefas.infrastructure.client.TarefasClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class TarefasService {

    private final TarefasClient tarefasClient;

    public TarefasDTOResponse gravarTarefa(String token, TarefasDTORequest dto) {
        return tarefasClient.gravarTarefas(dto, token);
    }

    public List<TarefasDTOResponse> buscaTarefasAgendadasPorPeriodo(LocalDateTime dataInicial,
                                                                    LocalDateTime dataFinal,
                                                                    String token) {
        return tarefasClient.buscaListaDeTarefasPorPeriodo(dataInicial, dataFinal, token);

    }

    public List<TarefasDTOResponse> buscaTarefasPorEmail(String token) {

        return tarefasClient.buscaTarefasPorEmail(token);
    }

    public void detelaTarefaPorId(String id, String token) {
        tarefasClient.deletaTarefaPorID(id, token);
    }

    public TarefasDTOResponse alteraStatus(StatusNotificacaoEnum status, String id, String token) {
        return tarefasClient.alteraStatusNotificacao(status, id, token);
    }

    public TarefasDTOResponse updateTarefas(TarefasDTORequest dto, String id, String token) {
        return tarefasClient.updateTarefas(dto, id, token);
    }

}
