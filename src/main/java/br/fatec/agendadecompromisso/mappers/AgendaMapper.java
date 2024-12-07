package br.fatec.agendadecompromisso.mappers;

import br.fatec.agendadecompromisso.dto.AgendaRequest;
import br.fatec.agendadecompromisso.dto.AgendaResponse;
import br.fatec.agendadecompromisso.entities.Agenda;

public class AgendaMapper {
    
    public static Agenda toEntity(AgendaRequest agendaRequest){
        Agenda agenda = new Agenda();
        agenda.setCompromisso(agendaRequest.compromisso());
        agenda.setDate(agendaRequest.date());
        agenda.setTime(agendaRequest.time());
        agenda.setLocal(agendaRequest.local());

        return agenda;
    }

    public static AgendaResponse toDTO(Agenda agenda){
        return new AgendaResponse(agenda.getId(), agenda.getCompromisso(), agenda.getDate(), agenda.getTime(), agenda.getLocal());
    }
}
