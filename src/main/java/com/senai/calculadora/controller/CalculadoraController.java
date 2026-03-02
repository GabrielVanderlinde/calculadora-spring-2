package com.senai.calculadora.controller;

import com.senai.calculadora.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @PostMapping("/adicionar")
    public ResponseEntity<ResultadoDto> adicionar(@RequestBody EntradaDto dados) {
        return ResponseEntity.ok().body("");
    }

    @PostMapping("/subtrair")
    public ResponseEntity<ResultadoDto> subtrair(@RequestBody EntradaDto dados) {
        return ResponseEntity.ok().body("");
    }


    @PostMapping("/multiplicar")
    public ResponseEntity<ResultadoDto> multiplicar(@RequestBody EntradaDto dados) {
        return ResponseEntity.ok().body("");
    }

    @PostMapping("/dividir")
    public ResponseEntity<ResultadoDto> dividir(@RequestBody EntradaDto dados) {
        return ResponseEntity.ok().body("");
    }
}
