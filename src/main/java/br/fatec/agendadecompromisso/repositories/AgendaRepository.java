package br.fatec.agendadecompromisso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.agendadecompromisso.entities.Agenda;

public interface AgendaRepository extends JpaRepository <Agenda, Long> {
    
}
