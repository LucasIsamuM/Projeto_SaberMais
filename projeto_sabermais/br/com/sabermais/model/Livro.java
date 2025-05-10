package br.com.sabermais.model;

import br.com.sabermais.enums.GeneroLivro;

public class Livro {
    private final String titulo;
    private final String autor;
    private final String editora;
    private final GeneroLivro generoLivro;
    private final int numeroExemplares;

    public Livro(
            String titulo;
            String autor;
            String editora;
            GeneroLivro generoLivro;
            int numeroExemplares;
    ){

        if (titulo == null || titulo.isBlank())
            throw new IllegalArgumentException("titulo invalido");
        if (autor == null || autor.isBlank())
            throw new IllegalArgumentException("autor invalido");
        if (editora == null || editora.isBlank())
            throw new IllegalArgumentException("editora invalida");
        if (generoLivro == null)
            throw new IllegalArgumentException("genero de livro invalido");
        if (numeroExemplares <= 0)
            throw new IllegalArgumentException("numero invalido");

        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.generoLivro = generoLivro;
        this.numeroExemplares = numeroExemplares;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public GeneroLivro getGeneroLivro() {
        return generoLivro;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }
}
