package br.fatec.agendadecompromisso.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.agendadecompromisso.dto.AgendaResponse;
import br.fatec.agendadecompromisso.entities.Agenda;
import br.fatec.agendadecompromisso.mappers.AgendaMapper;
import br.fatec.agendadecompromisso.repositories.AgendaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AgendaService {
    
    @Autowired
    private AgendaRepository repository;
 
    public List<AgendaResponse> getAllAgendas(){
        return repository.findAll().stream().map( a -> AgendaMapper.toDTO(a)).collect(Collectors.toList());
    }

    public AgendaResponse getAgendaById(Long id){
        Agenda agenda = repository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Compromisso não registrado")
        );
        
        return AgendaMapper.toDTO(agenda);
    }

}
