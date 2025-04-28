package com.losagiles.CineAgile.services;

import com.losagiles.CineAgile.entidades.Butaca;
import com.losagiles.CineAgile.entidades.Sala;
import com.losagiles.CineAgile.repository.ButacaRepository;
import com.losagiles.CineAgile.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SalaButacasService {
    @Autowired
    SalaRepository salaRepository;
    @Autowired
    ButacaRepository butacaRepository;

    public Sala mostrarSala(Long idSala) {
        Optional<Sala> sala = salaRepository.findById(idSala);
        return sala.orElse(null);
    }

    public List<Butaca> mostrarButacas(Long idSala) {
        List<Butaca> butacas = butacaRepository.findAllBySalaId(idSala);
        return butacas;
    }
}
