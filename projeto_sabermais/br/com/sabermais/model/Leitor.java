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
}
