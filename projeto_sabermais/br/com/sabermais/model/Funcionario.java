package br.com.sabermais.model;

import br.com.sabermais.enums.Cargo;

import java.time.LocalDate;

public class Funcionario {
    private final String nome;
    private final int cpf;
    private final LocalDate dataNascimento;
    private final Cargo cargo ;
    private final Unidade unidade;

public Funcionario (
        String nome;
        int cpf;
        LocalDate dataNascimento;
        Cargo cargo ;
        Unidade unidade;
){
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (cpf <= 0)
            throw new IllegalAccessException("CPF invalido.");
        if (dataNascimento <= 0)
            throw new IllegalArgumentException("Data de nascimento invalido.");

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
        this.unidade = unidade;

    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Unidade getUnidade() {
        return unidade;
    }
}

}
