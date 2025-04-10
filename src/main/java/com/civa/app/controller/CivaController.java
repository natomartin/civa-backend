package com.civa.app.controller;

import com.civa.app.entity.Bus;
import com.civa.app.entity.BusDTO;
import com.civa.app.service.CivaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CivaController {

    @Autowired
    private CivaService civaService;

    @GetMapping("/buses")
    public List<BusDTO> listarBuses() {
        return civaService.getAllBuses();
    }

    @GetMapping("/buses/{id}")
    public BusDTO getBusById(@PathVariable Long id) {
        return civaService.getBusById(id);
    }
}
