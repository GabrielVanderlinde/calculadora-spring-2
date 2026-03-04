package com.senai.calculadora.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultadoDto {

    private Double numero1;
    private Double numero2;
    private String operacao;
    private Double resultado;

    public ResultadoDto() {

    }
}
