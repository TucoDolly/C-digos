package model;

import java.time.LocalDateTime;

public class CheckQuarto {
    private int id;
    private LocalDateTime dtEntrada; // As per diagram, but might be redundant if Check has it
    private LocalDateTime dtSaida;   // As per diagram, but might be redundant
    private double subtotal;
    private double desconto;
    private char status;
    private int diarias;

    private Check check;
    private Quarto quarto;

    public CheckQuarto() {
    }

    public CheckQuarto(int id, LocalDateTime dtEntrada, LocalDateTime dtSaida, double subtotal, double desconto, char status, int diarias, Check check, Quarto quarto) {
        this.id = id;
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
        this.subtotal = subtotal;
        this.desconto = desconto;
        this.setStatus(status);
        this.diarias = diarias;
        this.check = check;
        this.quarto = quarto;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(LocalDateTime dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public LocalDateTime getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(LocalDateTime dtSaida) {
        this.dtSaida = dtSaida;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'C') || (status == 'F') || // Ativo, Cancelado, Faturado
            (status == 'a') || (status == 'c') || (status == 'f')) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A';
        }
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "CheckQuarto{" +
               "id=" + id +
               ", quarto=" + (quarto != null ? quarto.getNroQuarto() : "N/A") +
               ", checkId=" + (check != null ? check.getId() : "N/A") +
               ", subtotal=" + subtotal +
               ", diarias=" + diarias +
               ", status=" + status +
               '}';
    }
}