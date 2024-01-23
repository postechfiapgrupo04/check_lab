package br.com.check.lab.service;

import br.com.check.lab.domain.entity.Agendamento;
import br.com.check.lab.domain.entity.Exame;
import br.com.check.lab.domain.entity.Paciente;
import br.com.check.lab.domain.entity.TipoConfirmacao;
import br.com.check.lab.infrastructure.repository.AgendamentoRepository;
import br.com.check.lab.infrastructure.repository.ExameRepository;
import br.com.check.lab.infrastructure.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class InicializarDadosTeste {

        private AgendamentoRepository agendamentoRepository;
        private ExameRepository exameRepository;
        private Paciente paciente;
    private final PacienteRepository pacienteRepository;

    public InicializarDadosTeste(AgendamentoRepository agendamentoRepository, ExameRepository exameRepository,
                                 PacienteRepository pacienteRepository) {
            this.agendamentoRepository = agendamentoRepository;
            this.exameRepository = exameRepository;
        this.pacienteRepository = pacienteRepository;
    }

        public void inicializar() {

            for (int i = 0; i < 15; i++){
                Exame exame = new Exame();
                exame.setNome("Exame " + i);
                exame = exameRepository.save(exame);

                Paciente paciente = new Paciente();
                paciente.setNome("Paciente " + i);
                paciente.setIdade(i);
                paciente.setCpf("000.000.000-00");

                paciente = pacienteRepository.save(paciente);

                Agendamento agendamento = new Agendamento();
                agendamento.setPaciente(paciente);
                agendamento.setSituacao(TipoConfirmacao.PENDENTE);
                agendamento.setData(LocalDateTime.now());
                agendamento.setExames(List.of(exame));
                agendamentoRepository.save(agendamento);

            }
        }
}
