package com.senai.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public double divisao(double n1, double n2) {
        if (n1 == 0 || n2 == 0) {
            throw new IllegalArgumentException("Divisão por Zero Impossível");
        }
        return n1 / n2;
    }


}
