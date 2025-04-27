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

    }
}
