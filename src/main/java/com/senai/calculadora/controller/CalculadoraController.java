package com.senai.calculadora.controller;

import com.senai.calculadora.dto.*;
import com.senai.calculadora.service.CalculadoraService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
@AllArgsConstructor
public class CalculadoraController {
    final CalculadoraService service;

    @PostMapping
    public ResponseEntity<ResultadoDto> calcular(@RequestBody EntradaDto dados) {
        ResultadoDto resultado = service.calcular(dados);
        return ResponseEntity.ok().body(resultado);
    }
}
