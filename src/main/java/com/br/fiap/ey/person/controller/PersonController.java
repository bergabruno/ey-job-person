package com.br.fiap.ey.person.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
@RequestMapping("/person/v1")
public class PersonController {

    @GetMapping("/all")
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Chamada com sucesso");
    }
}
