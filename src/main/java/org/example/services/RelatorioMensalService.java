package org.example.services;

import org.example.repositories.DividaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RelatorioMensalService {

    private final DividaRepository dividaRepository;

    public RelatorioMensalService(DividaRepository dividaRepository) {
        this.dividaRepository = dividaRepository;
    }

    // Método para calcular despesas mensais
    public List<Map<String, Object>> obterDespesasMensais() {
        List<Map<String, Object>> despesasMensais = new ArrayList<>();

        // Aqui você pode buscar dados de despesas do repositório e organizá-los por ano e mês
        // Exemplo com dados fictícios
        Map<String, Object> despesaJaneiro = new HashMap<>();
        despesaJaneiro.put("ano", 2024);
        despesaJaneiro.put("mes", "Janeiro");
        despesaJaneiro.put("total", BigDecimal.valueOf(1500.00));

        Map<String, Object> despesaFevereiro = new HashMap<>();
        despesaFevereiro.put("ano", 2024);
        despesaFevereiro.put("mes", "Fevereiro");
        despesaFevereiro.put("total", BigDecimal.valueOf(2000.00));

        despesasMensais.add(despesaJaneiro);
        despesasMensais.add(despesaFevereiro);

        return despesasMensais;
    }
}
