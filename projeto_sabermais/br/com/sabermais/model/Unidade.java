package br.com.sabermais.model;

public class Unidade {
    private final String nome;
    private final Endereco endereco ;

    public Unidade(
            String nome;
            Endereco endereco;
    ){
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (endereco== null)
            throw new IllegalArgumentException("Endereço inválido.");

        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

