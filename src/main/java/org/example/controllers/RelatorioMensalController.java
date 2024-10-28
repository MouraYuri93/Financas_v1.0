package org.example.controllers;

import org.example.services.RelatorioMensalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/relatorio-mensal")
public class RelatorioMensalController {
    private final RelatorioMensalService relatorioMensalService;

    public RelatorioMensalController(RelatorioMensalService relatorioMensalService) {
        this.relatorioMensalService = relatorioMensalService;
    }

    @GetMapping
    public String exibirRelatorioMensal(Model model) {
        model.addAttribute("despesasMensais", relatorioMensalService.obterDespesasMensais());
        return "relatorio-mensal";
    }
}
