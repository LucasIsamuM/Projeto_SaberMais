package br.com.sabermais.model;

import br.com.sabermais.enums.Genero;
import br.com.sabermais.model.Endereco;

import java.time.LocalDate;

public class Leitor {
    private final String nome;
    private final LocalDate dataNascimento;
    private final int cpf;
    private final Genero genero;
    private final String email;
    private final int telefone;
    private final Endereco endereco;

    public Leitor(
            String nome;
            LocalDate dataNascimento;
            int cpf;
            Genero genero;
            String email;
            int telefone;
            Endereco endereco;
    ){
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (cpf <= 0 )
            throw new IllegalArgumentException("CPF inválido.");
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("E-mail inválido.");

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
