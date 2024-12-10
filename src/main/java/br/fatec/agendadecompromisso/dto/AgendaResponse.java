package br.fatec.agendadecompromisso.dto;

public record AgendaResponse(
    
    Long id,
    String compromisso,
    String date,
    String time,
    String local
) {

}
