package model;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int id;
    private String descricao;
    private int nroOcupantes;
    private String andar;
    private String nroQuarto;
    private boolean reservado;
    private String obs;
    private char status;

    private TipoQuarto tipoQuarto;
    private List<CheckQuarto> checkQuartos;
    private List<ReservaQuarto> reservaQuartos;

    public Quarto() {
        this.checkQuartos = new ArrayList<>();
        this.reservaQuartos = new ArrayList<>();
    }

    public Quarto(int id, String descricao, int nroOcupantes, String andar, String nroQuarto, boolean reservado, String obs, char status, TipoQuarto tipoQuarto) {
        this.id = id;
        this.descricao = descricao;
        this.nroOcupantes = nroOcupantes;
        this.andar = andar;
        this.nroQuarto = nroQuarto;
        this.reservado = reservado;
        this.obs = obs;
        this.setStatus(status);
        this.tipoQuarto = tipoQuarto;
        this.checkQuartos = new ArrayList<>();
        this.reservaQuartos = new ArrayList<>();
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

    public int getNroOcupantes() {
        return nroOcupantes;
    }

    public void setNroOcupantes(int nroOcupantes) {
        this.nroOcupantes = nroOcupantes;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getNroQuarto() {
        return nroQuarto;
    }

    public void setNroQuarto(String nroQuarto) {
        this.nroQuarto = nroQuarto;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
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
        if ((status == 'A') || (status == 'C') || (status == 'a') || (status == 'c')) {
            this.status = status;
        } else {
            this.status = 'A';
        }
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public List<CheckQuarto> getCheckQuartos() {
        return checkQuartos;
    }

    public void setCheckQuartos(List<CheckQuarto> checkQuartos) {
        this.checkQuartos = checkQuartos;
    }

    public List<ReservaQuarto> getReservaQuartos() {
        return reservaQuartos;
    }

    public void setReservaQuartos(List<ReservaQuarto> reservaQuartos) {
        this.reservaQuartos = reservaQuartos;
    }

    @Override
    public String toString() {
        return "Quarto{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", nroOcupantes=" + nroOcupantes +
               ", andar='" + andar + '\'' +
               ", nroQuarto='" + nroQuarto + '\'' +
               ", reservado=" + reservado +
               ", obs='" + obs + '\'' +
               ", status=" + status +
               ", tipoQuarto=" + (tipoQuarto != null ? tipoQuarto.getDescricao() : "N/A") +
               '}';
    }
}