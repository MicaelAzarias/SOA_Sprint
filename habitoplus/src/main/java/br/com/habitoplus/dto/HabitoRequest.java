package br.com.habitoplus.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HabitoRequest {

    @NotBlank(message = "O ID do colaborador é obrigatório")
    private String colaboradorId;

    @NotBlank(message = "O tipo de atividade é obrigatório")
    private String tipoAtividade;

    private String descricao;

    @NotNull(message = "A duração é obrigatória")
    @Min(value = 10, message = "A atividade deve ter no mínimo 10 minutos")
    private Integer minutosDuracao;
}