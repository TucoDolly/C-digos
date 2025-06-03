package model;

public class CheckHospede {
    private int id;
    private boolean principalResponsavel;
    private String obs;
    private char status;

    private Check check; // Link to the main Check-in record
    private Hospede hospede; // Link to the specific guest

    public CheckHospede() {
    }

    public CheckHospede(int id, boolean principalResponsavel, String obs, char status, Check check, Hospede hospede) {
        this.id = id;
        this.principalResponsavel = principalResponsavel;
        this.obs = obs;
        this.setStatus(status);
        this.check = check;
        this.hospede = hospede;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPrincipalResponsavel() {
        return principalResponsavel;
    }

    public void setPrincipalResponsavel(boolean principalResponsavel) {
        this.principalResponsavel = principalResponsavel;
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
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'A';
        }
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public String toString() {
        return "CheckHospede{" +
               "id=" + id +
               ", principalResponsavel=" + principalResponsavel +
               ", hospede=" + (hospede != null ? hospede.getNome() : "N/A") +
               ", checkId=" + (check != null ? check.getId() : "N/A") +
               ", status=" + status +
               '}';
    }
}