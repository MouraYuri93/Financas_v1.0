package org.example.controllers;

import org.example.models.Divida;
import org.example.services.DividaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dividas")
public class DividaController {
    private final DividaService dividaService;

    public DividaController(DividaService dividaService) {
        this.dividaService = dividaService;
    }

    @GetMapping
    public String listarDividas(Model model) {
        model.addAttribute("dividas", dividaService.listarDividas());
        return "dividas";
    }

    @PostMapping("/salvar")
    public String salvarDivida(@ModelAttribute Divida divida) {
        dividaService.salvarDivida(divida);
        return "redirect:/dividas";
    }
}
