package br.fatec.agendadecompromisso.dto;

public record AgendaRequest(

    String compromisso,
    String date,
    String time,
    String local
) {
    
}
