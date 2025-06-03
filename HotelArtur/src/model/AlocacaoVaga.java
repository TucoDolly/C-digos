package model;

import java.time.LocalDateTime;

public class AlocacaoVaga {
    private int id;
    private LocalDateTime dtAloc;
    private LocalDateTime dtLiber;
    private double valor;
    private char status;

    private Veiculo veiculo;
    private VagaEstacionamento vagaEstacionamento;

    public AlocacaoVaga() {
    }

    public AlocacaoVaga(int id, LocalDateTime dtAloc, LocalDateTime dtLiber, double valor, char status, Veiculo veiculo, VagaEstacionamento vagaEstacionamento) {
        this.id = id;
        this.dtAloc = dtAloc;
        this.dtLiber = dtLiber;
        this.valor = valor;
        this.setStatus(status);
        this.veiculo = veiculo;
        this.vagaEstacionamento = vagaEstacionamento;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDtAloc() {
        return dtAloc;
    }

    public void setDtAloc(LocalDateTime dtAloc) {
        this.dtAloc = dtAloc;
    }

    public LocalDateTime getDtLiber() {
        return dtLiber;
    }

    public void setDtLiber(LocalDateTime dtLiber) {
        this.dtLiber = dtLiber;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
         if ((status == 'A') || (status == 'C') || (status == 'P') || // Ativa, Concluída, Paga
            (status == 'a') || (status == 'c') || (status == 'p')) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A'; 
        }
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public VagaEstacionamento getVagaEstacionamento() {
        return vagaEstacionamento;
    }

    public void setVagaEstacionamento(VagaEstacionamento vagaEstacionamento) {
        this.vagaEstacionamento = vagaEstacionamento;
    }

    @Override
    public String toString() {
        return "AlocacaoVaga{" +
               "id=" + id +
               ", dtAloc=" + dtAloc +
               ", dtLiber=" + dtLiber +
               ", valor=" + valor +
               ", status=" + status +
               ", veiculo=" + (veiculo != null ? veiculo.getPlaca() : "N/A") +
               ", vagaEstacionamento=" + (vagaEstacionamento != null ? vagaEstacionamento.getDescricao() : "N/A") +
               '}';
    }
}