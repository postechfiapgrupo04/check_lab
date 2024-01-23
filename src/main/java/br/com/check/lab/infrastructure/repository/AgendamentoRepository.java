package br.com.check.lab.infrastructure.repository;

import br.com.check.lab.domain.entity.Agendamento;
import br.com.check.lab.domain.entity.TipoConfirmacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    List<Agendamento> findAllBySituacaoEquals(TipoConfirmacao situacao);

}
