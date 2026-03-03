package com.senai.calculadora.dto;

import jakarta.validation.constraints.Min;

public class EntradaDto {
    private Double numero1;
    @Min(value = 1, message = "Impossível Divisão por Zero!")
    private Double numero2;

    //Contructor
    public EntradaDto() {
    }

    //Get And Setter
    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
}
