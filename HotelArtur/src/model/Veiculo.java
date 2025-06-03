package model;

public class Veiculo {
    private int id;
    private String placa;
    private String cor;
    private char status;
    private int ano;

    private Modelo modelo;
    // According to diagram, AlocacaoVaga has one Veiculo.
    // If Veiculo needs to know its current alocacao, it would be here.
    // private AlocacaoVaga alocacaoVagaAtual;


    public Veiculo() {
    }

    public Veiculo(int id, String placa, String cor, char status, int ano, Modelo modelo) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.setStatus(status);
        this.ano = ano;
        this.modelo = modelo;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'I') || (status == 'M') || 
            (status == 'a') || (status == 'i') || (status == 'm')) { // Ativo, Inativo, Manutenção
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A'; // Default to Active
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
               "id=" + id +
               ", placa='" + placa + '\'' +
               ", cor='" + cor + '\'' +
               ", status=" + status +
               ", ano=" + ano +
               ", modelo=" + (modelo != null ? modelo.getDescricao() : "N/A") +
               '}';
    }
}