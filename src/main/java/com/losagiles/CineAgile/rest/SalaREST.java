package com.losagiles.CineAgile.rest;

import com.losagiles.CineAgile.entidades.Butaca;
import com.losagiles.CineAgile.entidades.Sala;
import com.losagiles.CineAgile.services.SalaButacasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/sala")
public class SalaREST {
    @Autowired
    SalaButacasService salaService;

    @GetMapping ("/{idSala}")
    public ResponseEntity<Sala> getSalas(@PathVariable long idSala) {
        return ResponseEntity.ok(salaService.mostrarSala(idSala));
    }
    @GetMapping ("/{idSala}/butacas")
    public ResponseEntity<List<Butaca>> getButacas(@PathVariable long idSala) {
        List<Butaca> butacas = salaService.mostrarButacas(idSala);
        return ResponseEntity.ok(butacas);
    }

}
