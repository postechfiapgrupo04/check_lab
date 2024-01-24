package br.com.check.lab.aplication.controller;

import br.com.check.lab.domain.entity.Agendamento;
import br.com.check.lab.domain.entity.Exame;
import br.com.check.lab.domain.entity.Paciente;
import br.com.check.lab.domain.entity.TipoConfirmacao;
import br.com.check.lab.infrastructure.repository.AgendamentoRepository;
import br.com.check.lab.infrastructure.repository.ExameRepository;
import br.com.check.lab.infrastructure.repository.PacienteRepository;
import br.com.check.lab.service.AgendamentoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AgendamentoControllerTest {

    @Autowired
    private AgendamentoService agendamentoService;

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Test
    void atualizarAgendamento() {

        List<Agendamento> listaDados = agendamentoService.lerAgendamentos();

        Agendamento agendamento = listaDados.get(0);
        agendamento.setSituacao(TipoConfirmacao.CONFIRMADO);
        agendamentoRepository.save(agendamento);

        listaDados = agendamentoService.lerAgendamentos();

        assertEquals(14,listaDados.size());

    }

    @Test
    void todosOsAgendamentosRetornadosDevemSerSituacaoPendente() {

        boolean valido = false;

        List<Agendamento> listaDados = agendamentoService.lerAgendamentos();

        boolean retorno = false;

        for (Agendamento agendamento : listaDados) {

            if(!agendamento.getSituacao().equals(TipoConfirmacao.PENDENTE)) retorno = true;

        }

        assertFalse(retorno);

    }
}