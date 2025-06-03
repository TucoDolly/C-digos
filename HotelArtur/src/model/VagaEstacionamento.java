package model;

import java.util.ArrayList;
import java.util.List;

public class VagaEstacionamento {
    private int id;
    private String descricao;
    private String tipo; // Ex: Coberta, Descoberta
    private char status; // Ex: D-Disponível, O-Ocupada, M-Manutenção

    private List<AlocacaoVaga> alocacoesVaga;

    public VagaEstacionamento() {
        this.alocacoesVaga = new ArrayList<>();
    }

    public VagaEstacionamento(int id, String descricao, String tipo, char status) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.setStatus(status); // Using setter for validation
        this.alocacoesVaga = new ArrayList<>();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        // Example validation, can be more specific like 'D', 'O', 'M'
        if (Character.isLetterOrDigit(status)) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'D'; // Default to Disponível
        }
    }

    public List<AlocacaoVaga> getAlocacoesVaga() {
        return alocacoesVaga;
    }

    public void setAlocacoesVaga(List<AlocacaoVaga> alocacoesVaga) {
        this.alocacoesVaga = alocacoesVaga;
    }

    @Override
    public String toString() {
        return "VagaEstacionamento{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", tipo='" + tipo + '\'' +
               ", status=" + status +
               '}';
    }
}