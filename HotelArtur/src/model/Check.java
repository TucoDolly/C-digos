package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Check { // Represents Check-in / Check-out
    private int id;
    private LocalDateTime dtEntrada;
    private LocalDateTime dtSaida;
    private double valorTotal;
    private double desconto;
    private String obs;
    private char status; // A-Ativo (Checked-in), F-Fechado (Checked-out), C-Cancelado

    private Hospede hospedePrincipal; // Diagram implies one primary Hospede for the Check
    private List<CheckHospede> checkHospedes; // List of all guests associated with this check-in
    private List<CheckQuarto> checkQuartos;   // List of rooms for this check-in
    private Receber contaReceber; // 0..1 relationship

    public Check() {
        this.checkHospedes = new ArrayList<>();
        this.checkQuartos = new ArrayList<>();
    }

    public Check(int id, LocalDateTime dtEntrada, LocalDateTime dtSaida, double valorTotal, double desconto, String obs, char status, Hospede hospedePrincipal) {
        this.id = id;
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.obs = obs;
        this.setStatus(status);
        this.hospedePrincipal = hospedePrincipal;
        this.checkHospedes = new ArrayList<>();
        this.checkQuartos = new ArrayList<>();
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
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
        if ((status == 'A') || (status == 'F') || (status == 'C') ||
            (status == 'a') || (status == 'f') || (status == 'c')) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A'; 
        }
    }

    public Hospede getHospedePrincipal() {
        return hospedePrincipal;
    }

    public void setHospedePrincipal(Hospede hospedePrincipal) {
        this.hospedePrincipal = hospedePrincipal;
    }

    public List<CheckHospede> getCheckHospedes() {
        return checkHospedes;
    }

    public void setCheckHospedes(List<CheckHospede> checkHospedes) {
        this.checkHospedes = checkHospedes;
    }

    public List<CheckQuarto> getCheckQuartos() {
        return checkQuartos;
    }

    public void setCheckQuartos(List<CheckQuarto> checkQuartos) {
        this.checkQuartos = checkQuartos;
    }
    
    public Receber getContaReceber() {
        return contaReceber;
    }

    public void setContaReceber(Receber contaReceber) {
        this.contaReceber = contaReceber;
    }

    @Override
    public String toString() {
        return "Check{" +
               "id=" + id +
               ", dtEntrada=" + dtEntrada +
               ", dtSaida=" + dtSaida +
               ", valorTotal=" + valorTotal +
               ", status=" + status +
               ", hospedePrincipal=" + (hospedePrincipal != null ? hospedePrincipal.getNome() : "N/A") +
               '}';
    }
}