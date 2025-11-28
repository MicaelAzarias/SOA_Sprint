package br.com.habitoplus.controller;

import br.com.habitoplus.dto.HabitoRequest;
import br.com.habitoplus.model.RegistroHabito;
import br.com.habitoplus.service.HabitoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/habitos")
public class HabitoController {

    @Autowired
    private HabitoService service;

    @PostMapping
    public ResponseEntity<RegistroHabito> registrar(@RequestBody @Valid HabitoRequest request) {
        RegistroHabito novoHabito = service.registrarHabito(request);
        return new ResponseEntity<>(novoHabito, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<String> checkHealth() {
        return ResponseEntity.ok("API HábitoPlus rodando com sucesso!");
    }
}