package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Receber { // Represents an account receivable
    private int id;
    private LocalDateTime dtHrEmissao;
    private LocalDate dtVencimento;
    private LocalDate dtPagamento;
    private double valorEmitido;
    private double desconto;
    private double acrescimo;
    private double valorPago;
    private char status; // P-Pendente, Q-Quitado, C-Cancelado
    private String obs;

    private Check checkOrigem; // 0..1, if this receivable is from a Check
    private OrdemServico ordemServicoOrigem; // 0..1, if from an OrdemServico

    public Receber() {
    }

    public Receber(int id, LocalDateTime dtHrEmissao, LocalDate dtVencimento, LocalDate dtPagamento, double valorEmitido, double desconto, double acrescimo, double valorPago, char status, String obs) {
        this.id = id;
        this.dtHrEmissao = dtHrEmissao;
        this.dtVencimento = dtVencimento;
        this.dtPagamento = dtPagamento;
        this.valorEmitido = valorEmitido;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
        this.valorPago = valorPago;
        this.setStatus(status);
        this.obs = obs;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDtHrEmissao() {
        return dtHrEmissao;
    }

    public void setDtHrEmissao(LocalDateTime dtHrEmissao) {
        this.dtHrEmissao = dtHrEmissao;
    }

    public LocalDate getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(LocalDate dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public LocalDate getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(LocalDate dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public double getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(double valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'P') || (status == 'Q') || (status == 'C') ||
            (status == 'p') || (status == 'q') || (status == 'c') ) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'P'; // Default to Pendente
        }
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Check getCheckOrigem() {
        return checkOrigem;
    }

    public void setCheckOrigem(Check checkOrigem) {
        this.checkOrigem = checkOrigem;
    }

    public OrdemServico getOrdemServicoOrigem() {
        return ordemServicoOrigem;
    }

    public void setOrdemServicoOrigem(OrdemServico ordemServicoOrigem) {
        this.ordemServicoOrigem = ordemServicoOrigem;
    }

    @Override
    public String toString() {
        return "Receber{" +
               "id=" + id +
               ", valorEmitido=" + valorEmitido +
               ", dtVencimento=" + dtVencimento +
               ", status=" + status +
               '}';
    }
}