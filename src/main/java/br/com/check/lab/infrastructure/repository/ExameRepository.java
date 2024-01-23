package br.com.check.lab.infrastructure.repository;

import br.com.check.lab.domain.entity.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {
}
