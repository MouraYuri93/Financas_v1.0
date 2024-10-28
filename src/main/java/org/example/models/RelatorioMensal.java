package org.example.models;

import java.math.BigDecimal;

public class RelatorioMensal {
    private int ano;
    private String mes;
    private BigDecimal totalDespesas;

    public RelatorioMensal(int ano, String mes, BigDecimal totalDespesas) {
        this.ano = ano;
        this.mes = mes;
        this.totalDespesas = totalDespesas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public BigDecimal getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(BigDecimal totalDespesas) {
        this.totalDespesas = totalDespesas;
    }
}
