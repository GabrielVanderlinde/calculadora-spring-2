package com.senai.calculadora.service;

import com.senai.calculadora.dto.*;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public ResultadoDto calcular(EntradaDto dados) {
        ResultadoDto resultadoDto = new ResultadoDto();

        //Prenchemos os dados para sair depois
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());
        resultadoDto.setOperacao(dados.getOperacao());

        double resultado = 0.0;

        // 2. Lógica Switch para decidir o cálculo baseado na String da operação
        switch (dados.getOperacao()) {
            case "+":
                resultado = dados.getNumero1() + dados.getNumero2();
                break;
            case "-":
                resultado = dados.getNumero1() - dados.getNumero2();
                break;
            case "*":
                resultado = dados.getNumero1() * dados.getNumero2();
                break;
            case "/":
                if (dados.getNumero2() == 0) {
                    throw new IllegalArgumentException("Impossível Divisão por Zero!");
                }
                resultado = dados.getNumero1() / dados.getNumero2();
                break;
            case "%":
                resultado = dados.getNumero1() % dados.getNumero2();
                break;
            case "^":
                resultado = Math.pow(dados.getNumero1(), dados.getNumero2());
                break;
            default:
                throw new IllegalArgumentException("Operação inválida! Use +, -, *, /, % ou ^.");
        }
        // 3. Setamos o resultado final e retornamos
        resultadoDto.setResultado(resultado);
        return resultadoDto;
    }
}