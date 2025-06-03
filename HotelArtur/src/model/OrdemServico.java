package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    private int id;
    private LocalDateTime dtHrSolicitacao;
    private LocalDateTime dtHrConclusao;
    private double valorTotal;
    private double desconto;
    private char status; // P-Pendente, E-EmExecucao, C-Concluida, X-Cancelada

    private Check check; // Link to the Check (room/guest stay)
    private Funcionario funcionarioResponsavel; // Employee who performed/is responsible
    
    // The diagram shows "servico 1..*" linked to "ordemservico 0..*"
    // This means one OrdemServico can include multiple Servico items.
    // A better model would be a List<OrdemServicoItem> where OrdemServicoItem links to Servico and has quantity.
    // For simplicity based on direct interpretation: List<Servico>
    private List<Servico> servicosPrestados; 
    private Receber contaReceber; // 0..1 relationship

    public OrdemServico() {
        this.servicosPrestados = new ArrayList<>();
    }

    public OrdemServico(int id, LocalDateTime dtHrSolicitacao, LocalDateTime dtHrConclusao, double valorTotal, double desconto, char status, Check check, Funcionario funcionarioResponsavel) {
        this.id = id;
        this.dtHrSolicitacao = dtHrSolicitacao;
        this.dtHrConclusao = dtHrConclusao;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.setStatus(status);
        this.check = check;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.servicosPrestados = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDtHrSolicitacao() {
        return dtHrSolicitacao;
    }

    public void setDtHrSolicitacao(LocalDateTime dtHrSolicitacao) {
        this.dtHrSolicitacao = dtHrSolicitacao;
    }

    public LocalDateTime getDtHrConclusao() {
        return dtHrConclusao;
    }

    public void setDtHrConclusao(LocalDateTime dtHrConclusao) {
        this.dtHrConclusao = dtHrConclusao;
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

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'P') || (status == 'E') || (status == 'C') || (status == 'X') ||
            (status == 'p') || (status == 'e') || (status == 'c') || (status == 'x') ) {
            this.status = Character.toUpperCase(status);
        } else {
            this.status = 'P'; 
        }
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Servico> getServicosPrestados() {
        return servicosPrestados;
    }

    public void setServicosPrestados(List<Servico> servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }
    
    public Receber getContaReceber() {
        return contaReceber;
    }

    public void setContaReceber(Receber contaReceber) {
        this.contaReceber = contaReceber;
    }


    @Override
    public String toString() {
        return "OrdemServico{" +
               "id=" + id +
               ", dtHrSolicitacao=" + dtHrSolicitacao +
               ", status=" + status +
               ", checkId=" + (check != null ? check.getId() : "N/A") +
               ", funcionario=" + (funcionarioResponsavel != null ? funcionarioResponsavel.getNome() : "N/A") +
               '}';
    }
}