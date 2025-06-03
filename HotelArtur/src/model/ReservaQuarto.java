package model;

import java.time.LocalDate;

public class ReservaQuarto {
    private int id; // Added an ID for the association table, common practice
    private LocalDate dtEntradaPrev;
    private LocalDate dtSaidaPrev;
    private double subtotal;
    private double desconto;
    private char status;
    private int diarias;

    private Reserva reserva;
    private Quarto quarto;

    public ReservaQuarto() {
    }

    public ReservaQuarto(int id, LocalDate dtEntradaPrev, LocalDate dtSaidaPrev, double subtotal, double desconto, char status, int diarias, Reserva reserva, Quarto quarto) {
        this.id = id;
        this.dtEntradaPrev = dtEntradaPrev;
        this.dtSaidaPrev = dtSaidaPrev;
        this.subtotal = subtotal;
        this.desconto = desconto;
        this.setStatus(status);
        this.diarias = diarias;
        this.reserva = reserva;
        this.quarto = quarto;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDtEntradaPrev() {
        return dtEntradaPrev;
    }

    public void setDtEntradaPrev(LocalDate dtEntradaPrev) {
        this.dtEntradaPrev = dtEntradaPrev;
    }

    public LocalDate getDtSaidaPrev() {
        return dtSaidaPrev;
    }

    public void setDtSaidaPrev(LocalDate dtSaidaPrev) {
        this.dtSaidaPrev = dtSaidaPrev;
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
        if ((status == 'A') || (status == 'C') || (status == 'U') || // Ativa, Cancelada, Utilizada
            (status == 'a') || (status == 'c') || (status == 'u') ) {
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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "ReservaQuarto{" +
               "id=" + id +
               ", quarto=" + (quarto != null ? quarto.getNroQuarto() : "N/A") +
               ", reservaId=" + (reserva != null ? reserva.getId() : "N/A") +
               ", diarias=" + diarias +
               ", subtotal=" + subtotal +
               '}';
    }
}