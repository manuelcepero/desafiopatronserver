/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntt.desafiopatronserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Manuel
 */
@RestController
public class Controlador {

    Logger logger = LoggerFactory.getLogger(Controlador.class);

    String status;
    String open = "open";
    String halfOpen = "half-open";
    String close = "close";

    @GetMapping("/open")
    public ResponseEntity<String> setToOpen() {
        status = open;
        logger.info("Estado: " + status);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }

    @GetMapping("/half-open")
    public ResponseEntity<String> setToHalfToOpen() {
        status = halfOpen;
        logger.info("Estado: " + status);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }

    @GetMapping("/close")
    public ResponseEntity<String> setToClose() {
        status = close;
        logger.info("Estado: " + status);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }
}
