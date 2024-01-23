package br.com.check.lab.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Exame> exames = new ArrayList<>();

    private LocalDateTime data;

    @OneToOne
    private Paciente paciente;

    @Enumerated(EnumType.STRING)
    private TipoConfirmacao situacao;

}
