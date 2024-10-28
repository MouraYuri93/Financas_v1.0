package org.example.services;

import org.example.models.Rendimento;
import org.example.repositories.RendimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendimentoService {
    private final RendimentoRepository rendimentoRepository;

    public RendimentoService(RendimentoRepository rendimentoRepository) {
        this.rendimentoRepository = rendimentoRepository;
    }

    public List<Rendimento> listarRendimentos() {
        return rendimentoRepository.findAll();
    }

    public void salvarRendimento(Rendimento rendimento) {
        rendimentoRepository.save(rendimento);
    }

    public void deletarRendimento(Long id) {
        rendimentoRepository.deleteById(id);
    }
}
