package com.senai.calculadora.dto;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EntradaDto {
    private Double numero1;
    @Min(value = 1, message = "Impossível Divisão por Zero!")
    private Double numero2;

    private String operacao;
}
