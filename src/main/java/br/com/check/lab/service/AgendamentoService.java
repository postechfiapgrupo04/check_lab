package br.com.check.lab.service;

import br.com.check.lab.domain.entity.Agendamento;
import br.com.check.lab.domain.entity.TipoConfirmacao;
import br.com.check.lab.exception.NotFoundException;
import br.com.check.lab.infrastructure.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    public Agendamento criarAgendamento(Agendamento agendamento){
        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> lerAgendamentos() {
        return agendamentoRepository.findAllBySituacaoEquals(TipoConfirmacao.PENDENTE);
    }

    public Agendamento atualizarAgendamento(Agendamento agendamento){
        Optional<Agendamento> agendamentoTemp = agendamentoRepository.findById(agendamento.getId());
        if (agendamentoTemp.isPresent()) {
            agendamentoTemp.get().setSituacao(agendamento.getSituacao());
            return agendamentoRepository.save(agendamentoTemp.get());
        }
        throw new NotFoundException("Agendamento não encontrado");
    }

}