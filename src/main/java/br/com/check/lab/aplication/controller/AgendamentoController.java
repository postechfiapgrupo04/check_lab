package br.com.check.lab.aplication.controller;


import br.com.check.lab.domain.entity.Agendamento;
import br.com.check.lab.service.AgendamentoService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {


    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PutMapping()
    public ResponseEntity<?> atualizarAgendamento(@RequestBody Agendamento agendamento){

        return ResponseEntity.status(HttpStatusCode.valueOf(201))
                .body(agendamentoService.atualizarAgendamento(agendamento));

    }

    @GetMapping()
    public ResponseEntity<?> lerAgendamentos(){

        return ResponseEntity.status(HttpStatusCode.valueOf(201))
                .body(agendamentoService.lerAgendamentos());

    }

}
