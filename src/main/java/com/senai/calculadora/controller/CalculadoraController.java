package com.senai.calculadora.controller;

import com.senai.calculadora.dto.*;
import com.senai.calculadora.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    //Injeção de Dependencias Service
    final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<ResultadoDto> adicionar(@RequestBody EntradaDto dados) {
        //--Executando metodo de adicionar da classe service
        ResultadoDto resultado = service.adicao(dados);
        //--Retorna resposta para Cliente
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/subtrair")
    public ResponseEntity<ResultadoDto> subtrair(@RequestBody EntradaDto dados) {
        //--Executando metodo de subtrair da classe service
        ResultadoDto resultado = service.subtracao(dados);
        //--Retorna resposta para Cliente
        return ResponseEntity.ok().body(resultado);
    }


    @PostMapping("/multiplicar")
    public ResponseEntity<ResultadoDto> multiplicar(@RequestBody EntradaDto dados) {
        //--Executando metodo de multiplicar da classe service
        ResultadoDto resultado = service.multiplicacao(dados);
        //--Retorna resposta para Cliente
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/dividir")
    public ResponseEntity<ResultadoDto> dividir(@RequestBody EntradaDto dados) {
        //--Executando metodo de dividir da classe service
        ResultadoDto resultado = service.divisao(dados);
        //--Retorna resposta para Cliente
        return ResponseEntity.ok().body(resultado);
    }
}
