package br.com.check.lab.controller;


import br.com.check.lab.entity.Agendamento;
import br.com.check.lab.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {


    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<?> adicionarAgendamento(@RequestBody Agendamento agendamento){

        return ResponseEntity.status(HttpStatusCode.valueOf(201))
                .body(agendamentoService.criarAgendamento(agendamento));

    }

}
