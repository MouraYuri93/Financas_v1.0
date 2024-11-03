package org.example.controllers;

import org.example.models.Divida;
import org.example.services.DividaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/dividas")
public class DividaController {

    private static final Logger logger = LoggerFactory.getLogger(DividaController.class);

    private final DividaService dividaService;

    @Autowired
    public DividaController(DividaService dividaService) {
        this.dividaService = dividaService;
    }

    @GetMapping
    public String listarDividas(Model model) {
        try {
            model.addAttribute("dividas", dividaService.listarDividas());
            model.addAttribute("divida", new Divida()); // Para o formulário de nova dívida
            return "dividas";
        } catch (Exception e) {
            logger.error("Erro ao listar dívidas", e);
            model.addAttribute("errorMessage", "Erro ao carregar a lista de dívidas.");
            return "error"; // Certifique-se de ter um template 'error.html'
        }
    }

    @PostMapping("/salvar")
    public String salvarDivida(@ModelAttribute Divida divida, Model model) {
        try {
            dividaService.salvarDivida(divida);
            return "redirect:/dividas";
        } catch (Exception e) {
            logger.error("Erro ao salvar dívida", e);
            model.addAttribute("errorMessage", "Erro ao salvar a dívida.");
            model.addAttribute("dividas", dividaService.listarDividas()); // Recarregar a lista em caso de erro
            return "dividas";
        }
    }
}
