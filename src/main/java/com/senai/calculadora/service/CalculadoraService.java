package com.senai.calculadora.service;

import com.senai.calculadora.dto.*;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public ResultadoDto adicionar(EntradaDto dados) {
        ResultadoDto resultadoDto = new ResultadoDto();
        // Correção: Buscar dados do objeto 'dados'
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());
        resultadoDto.setResultado(dados.getNumero1() + dados.getNumero2());
        return resultadoDto;
    }

    public ResultadoDto subtrair(EntradaDto dados) {
        ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());
        resultadoDto.setResultado(dados.getNumero1() - dados.getNumero2());
        return resultadoDto;
    }

    public ResultadoDto multiplicar(EntradaDto dados) {
        ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());
        resultadoDto.setResultado(dados.getNumero1() * dados.getNumero2());
        return resultadoDto;
    }

    public ResultadoDto dividir(EntradaDto dados) {

        ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());
        resultadoDto.setResultado(dados.getNumero1() / dados.getNumero2());
        return resultadoDto;
    }

    public ResultadoDto modulo(EntradaDto dados) {

        ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());
        resultadoDto.setResultado(dados.getNumero1() % dados.getNumero2());
        return resultadoDto;
    }

    public ResultadoDto potenciacao(EntradaDto dados) {

        ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setNumero1(dados.getNumero1());
        resultadoDto.setNumero2(dados.getNumero2());

        double potencia = Math.pow(dados.getNumero1(), dados.getNumero2());

        resultadoDto.setResultado(potencia);

        return resultadoDto;
    }
}