package com.senai.calculadora.dto;

public class ResultadoDto {

    private Double numero1;
    private Double numero2;
    private Double resultado;

    //Constructor
    public ResultadoDto() {
    }

    //Get and Set
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

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
}
