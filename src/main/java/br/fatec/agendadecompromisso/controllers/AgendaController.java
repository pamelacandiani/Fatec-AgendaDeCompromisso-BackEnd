package br.fatec.agendadecompromisso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatec.agendadecompromisso.dto.AgendaResponse;
import br.fatec.agendadecompromisso.services.AgendaService;


@RestController
@RequestMapping("agendas")
public class AgendaController {
    
    @Autowired
    private AgendaService service;

    @GetMapping
    public ResponseEntity <List <AgendaResponse>> getAgendas(){
        return ResponseEntity.ok(service.getAllAgendas());
    }


}
