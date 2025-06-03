package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private int id;
    private String descricao;
    private double saldo;
    private LocalDateTime dtAbertura;
    private LocalDateTime dtFechamento;
    private char status; // A-Aberto, F-Fechado

    private List<MovimentoCaixa> movimentosCaixa;

    public Caixa() {
        this.movimentosCaixa = new ArrayList<>();
    }

    public Caixa(int id, String descricao, double saldo, LocalDateTime dtAbertura, LocalDateTime dtFechamento, char status) {
        this.id = id;
        this.descricao = descricao;
        this.saldo = saldo;
        this.dtAbertura = dtAbertura;
        this.dtFechamento = dtFechamento;
        this.setStatus(status);
        this.movimentosCaixa = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(LocalDateTime dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public LocalDateTime getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(LocalDateTime dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'F') || (status == 'a') || (status == 'f')) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'F'; // Default to Fechado
        }
    }

    public List<MovimentoCaixa> getMovimentosCaixa() {
        return movimentosCaixa;
    }

    public void setMovimentosCaixa(List<MovimentoCaixa> movimentosCaixa) {
        this.movimentosCaixa = movimentosCaixa;
    }

    @Override
    public String toString() {
        return "Caixa{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", saldo=" + saldo +
               ", status=" + status +
               '}';
    }
}