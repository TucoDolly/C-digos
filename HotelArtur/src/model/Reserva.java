package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int id;
    private LocalDate dtReserva;
    private LocalDate dtEntradaPrev;
    private LocalDate dtSaidaPrev;
    private double valorTotal; // Could be calculated from ReservaQuartos
    private int qtdePessoas;
    private char status; // P-Pendente, C-Confirmada, X-Cancelada, U-Utilizada
    private String obs;

    private Hospede hospede;
    private List<ReservaQuarto> reservaQuartos;

    public Reserva() {
        this.reservaQuartos = new ArrayList<>();
    }

    public Reserva(int id, LocalDate dtReserva, LocalDate dtEntradaPrev, LocalDate dtSaidaPrev, double valorTotal, int qtdePessoas, char status, String obs, Hospede hospede) {
        this.id = id;
        this.dtReserva = dtReserva;
        this.dtEntradaPrev = dtEntradaPrev;
        this.dtSaidaPrev = dtSaidaPrev;
        this.valorTotal = valorTotal;
        this.qtdePessoas = qtdePessoas;
        this.setStatus(status);
        this.obs = obs;
        this.hospede = hospede;
        this.reservaQuartos = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDtReserva() {
        return dtReserva;
    }

    public void setDtReserva(LocalDate dtReserva) {
        this.dtReserva = dtReserva;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'P') || (status == 'C') || (status == 'X') || (status == 'U') ||
            (status == 'p') || (status == 'c') || (status == 'x') || (status == 'u')) {
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

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public List<ReservaQuarto> getReservaQuartos() {
        return reservaQuartos;
    }

    public void setReservaQuartos(List<ReservaQuarto> reservaQuartos) {
        this.reservaQuartos = reservaQuartos;
    }

    @Override
    public String toString() {
        return "Reserva{" +
               "id=" + id +
               ", dtReserva=" + dtReserva +
               ", hospede=" + (hospede != null ? hospede.getNome() : "N/A") +
               ", status=" + status +
               '}';
    }
}