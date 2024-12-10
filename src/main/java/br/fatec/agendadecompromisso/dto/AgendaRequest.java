package br.fatec.agendadecompromisso.dto;

import jakarta.validation.constraints.NotBlank;

public record AgendaRequest(

    @NotBlank(message = "Compromisso não pode ser em branco")
    String compromisso,

    @NotBlank(message = "Data não pode ser em branco")
    String date,

    @NotBlank(message = "Horario não pode ser em branco")
    String time,

    @NotBlank(message = "Local não pode ser em branco")
    String local
) {
    
}
