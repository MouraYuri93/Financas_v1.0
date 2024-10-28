
package org.example.controllers;

import org.example.models.Rendimento;
import org.example.services.RendimentoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rendimentos")
public class RendimentoController {
    private final RendimentoService rendimentoService;

    public RendimentoController(RendimentoService rendimentoService) {
        this.rendimentoService = rendimentoService;
    }

    @GetMapping
    public String listarRendimentos(Model model) {
        model.addAttribute("rendimentos", rendimentoService.listarRendimentos());
        return "rendimentos";
    }

    @PostMapping("/salvar")
    public String salvarRendimento(@ModelAttribute Rendimento rendimento) {
        rendimentoService.salvarRendimento(rendimento);
        return "redirect:/rendimentos";
    }
}
