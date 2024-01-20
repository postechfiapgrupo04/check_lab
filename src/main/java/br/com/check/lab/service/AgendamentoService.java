package br.com.check.lab.service;

import br.com.check.lab.entity.Agendamento;
import br.com.check.lab.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento criarAgendamento(Agendamento agendamento){
        return agendamentoRepository.save(agendamento);
    }

}
