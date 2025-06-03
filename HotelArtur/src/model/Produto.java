package model;

public class Produto { // Corresponds to produtocapa
    private int id;
    private String descricao;
    private String codigoBarras;
    private double valor;
    private int estoque; // Diagram says 'quantidade', using 'estoque' for clarity
    private char status;

    public Produto() {
    }

    public Produto(int id, String descricao, String codigoBarras, double valor, int estoque, char status) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
        this.estoque = estoque;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'I') || (status == 'a') || (status == 'i')) { // Ativo, Inativo
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A';
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", valor=" + valor +
               ", estoque=" + estoque +
               ", status=" + status +
               '}';
    }
}