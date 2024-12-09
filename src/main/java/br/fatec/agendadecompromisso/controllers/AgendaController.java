package br.fatec.agendadecompromisso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatec.agendadecompromisso.dto.AgendaRequest;
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

    @GetMapping("{id}")
    public ResponseEntity <AgendaResponse> getAgendas(@PathVariable Long id){
        return ResponseEntity.ok(service.getAgendaById(id));
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteAgenda(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping 
    public ResponseEntity <AgendaResponse> saveAgenda(@RequestBody AgendaRequest agenda){
        AgendaResponse newAgenda = service.save(agenda);
        return ResponseEntity.created(null).body(newAgenda);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateAgenda(@PathVariable long id, @RequestBody AgendaRequest agenda){
        service.update(agenda, id);
        return ResponseEntity.ok().build();
    }

}
