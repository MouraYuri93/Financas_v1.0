
package org.example.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Divida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // Getters e setters
}
