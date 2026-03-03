package com.senai.calculadora.service;

import com.senai.calculadora.dto.*;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public ResultadoDto adicionar(EntradaDto dados) {
        //--Inicializa Variaveis
        ResultadoDto resultadoDto = new ResultadoDto();

        //--Processo
        resultadoDto.setNumero1(resultadoDto.getNumero1());
        resultadoDto.setNumero2(resultadoDto.getNumero2());
        resultadoDto.setResultado();
        //--Saída
        return resultadoDto;
    }
}
