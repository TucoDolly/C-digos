package model;

public class Servico {
    private int id;
    private String descricao;
    private double valor;
    private String obs;
    private char status;

    public Servico() {
    }

    public Servico(int id, String descricao, double valor, String obs, char status) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.obs = obs;
        this.setStatus(status);
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        if ((status == 'A') || (status == 'I') || (status == 'a') || (status == 'i')) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A';
        }
    }

    @Override
    public String toString() {
        return "Servico{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", valor=" + valor +
               ", status=" + status +
               '}';
    }
}