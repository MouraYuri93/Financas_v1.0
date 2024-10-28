package org.example.services;

import org.example.models.RelatorioMensal;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class RelatorioMensalService {
    public List<RelatorioMensal> gerarRelatorioMensal() {
        List<RelatorioMensal> relatorios = new ArrayList<>();
        relatorios.add(new RelatorioMensal(2024, "Janeiro", BigDecimal.valueOf(1500.00)));
        relatorios.add(new RelatorioMensal(2024, "Fevereiro", BigDecimal.valueOf(2000.00)));
        // Adicione mais dados conforme necessário
        return relatorios;
    }
}
