package model;

import java.time.LocalDateTime;

public class MovimentoCaixa {
    private int id;
    private LocalDateTime dtMovimento;
    private double valor;
    private String tipoMovimento; // "ENTRADA", "SAIDA" or "E", "S"
    private String obs;
    private char status; // C-Confirmado, E-Estornado

    private Caixa caixa; // The caixa this movement belongs to
    private Receber receber; // If it's an entry from a payment (0..1 relationship)
    // private Pagar pagar; // If there was a Pagar entity

    public MovimentoCaixa() {
    }

    public MovimentoCaixa(int id, LocalDateTime dtMovimento, double valor, String tipoMovimento, String obs, char status, Caixa caixa) {
        this.id = id;
        this.dtMovimento = dtMovimento;
        this.valor = valor;
        this.tipoMovimento = tipoMovimento;
        this.obs = obs;
        this.setStatus(status);
        this.caixa = caixa;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(LocalDateTime dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'C') || (status == 'E') || (status == 'c') || (status == 'e')) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'C'; // Default to Confirmado
        }
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    
    public Receber getReceber() {
        return receber;
    }

    public void setReceber(Receber receber) {
        this.receber = receber;
    }

    @Override
    public String toString() {
        return "MovimentoCaixa{" +
               "id=" + id +
               ", dtMovimento=" + dtMovimento +
               ", valor=" + valor +
               ", tipoMovimento='" + tipoMovimento + '\'' +
               ", status=" + status +
               '}';
    }
}