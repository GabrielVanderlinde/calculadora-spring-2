package com.senai.calculadora.controller;

import com.senai.calculadora.dto.*;
import com.senai.calculadora.service.CalculadoraService;
import jakarta.validation.Valid;
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

    public ResponseEntity<ResultadoDto> adicionar(@RequestBody EntradaDto dados) {
        ResultadoDto resultado = service.adicionar(dados);
        return ResponseEntity.ok().body(resultado);
    }

    public ResponseEntity<ResultadoDto> subtrair(@RequestBody EntradaDto dados) {
        ResultadoDto resultado = service.subtrair(dados);
        return ResponseEntity.ok().body(resultado);
    }


    public ResponseEntity<ResultadoDto> multiplicar(@RequestBody EntradaDto dados) {
        ResultadoDto resultado = service.multiplicar(dados);
        return ResponseEntity.ok().body(resultado);
    }

    public ResponseEntity<ResultadoDto> dividir(@RequestBody @Valid EntradaDto dados) {
        ResultadoDto resultado = service.dividir(dados);
        return ResponseEntity.ok().body(resultado);
    }
}
