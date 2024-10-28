package org.example.services;

import org.example.models.Divida;
import org.example.repositories.DividaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DividaService {
    private final DividaRepository dividaRepository;

    public DividaService(DividaRepository dividaRepository) {
        this.dividaRepository = dividaRepository;
    }

    public List<Divida> listarDividas() {
        return dividaRepository.findAll();
    }

    public void salvarDivida(Divida divida) {
        dividaRepository.save(divida);
    }

    public void deletarDivida(Long id) {
        dividaRepository.deleteById(id);
    }
}
