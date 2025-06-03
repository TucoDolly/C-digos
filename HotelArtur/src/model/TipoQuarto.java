package model;

public class TipoQuarto {
    private int id;
    private String descricao;
    private double valor;
    private char status;

    public TipoQuarto() {
    }

    public TipoQuarto(int id, String descricao, double valor, char status) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.setStatus(status);
    }

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

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'C') || (status == 'a') || (status == 'c')) {
            this.status = status;
        } else {
            this.status = 'A'; // Default to Active
        }
    }

    @Override
    public String toString() {
        return "TipoQuarto{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", valor=" + valor +
               ", status=" + status +
               '}';
    }
}