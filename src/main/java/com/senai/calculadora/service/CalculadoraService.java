package com.senai.calculadora.service;

import com.senai.calculadora.dto.EntradaDto;
import com.senai.calculadora.dto.ResultadoDto;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public ResultadoDto adicao(EntradaDto dados) {
        return new ResultadoDto();
    }

    public ResultadoDto subtracao(EntradaDto dados) {
        return new ResultadoDto();
    }

    public ResultadoDto multiplicacao(EntradaDto dados) {
        return new ResultadoDto();
    }

    public ResultadoDto divisao(EntradaDto dados) {
        return new ResultadoDto();
    }
}
