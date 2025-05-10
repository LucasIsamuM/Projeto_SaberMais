package br.com.sabermais.model;

import java.time.LocalDate;

public class Emprestimo {
    private final Livro livroid;
    private final Leitor leitor;
    private final Unidade unidade;
    private final LocalDate dataEmprestimo ;
    private final LocalDate dataDevolucao;
    private final int renovacoes;
    private final Boolean reserva;
    private final String devolucaoEfetiva;

    public Emprestimo(
            Livro livroid;
            Leitor leitor;
            Unidade unidade;
            LocalDate dataEmprestimo ;
            LocalDate dataDevolucao;
            int renovacoes;
            Boolean reserva;
            String devolucaoEfetiva;
    ){
        if (livroid == null)
            throw new IllegalArgumentException("livro invalido");

        if (leitor == null)
            throw new IllegalArgumentException("leitor invalido");

        if (unidade == null)
            throw new IllegalArgumentException("unidade invalida");

        if (dataEmprestimo <= 0)
            throw new IllegalArgumentException("data de emprestimo invalido");

        if (dataDevolucao <= 0)
            throw new IllegalArgumentException("data de devolucao invalida");

        if (renovacoes <= 0)
            throw new IllegalArgumentException("renovacao invalido");

        if (reserva == false)
            throw new IllegalArgumentException("reserva invalida");

        if (devolucaoEfetiva == null || devolucaoEfetiva.isBlank())
            throw new IllegalArgumentException("devolucao efetiva invalida");

        this.livroid = livroid;
        this.leitor = leitor;
        this.unidade = unidade;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.renovacoes = renovacoes;
        this.reserva = reserva;
        this.devolucaoEfetiva = devolucaoEfetiva;

    }

    public Livro getLivroid() {
        return livroid;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public Boolean getReserva() {
        return reserva;
    }

    public String getDevolucaoEfetiva() {
        return devolucaoEfetiva;
    }
}