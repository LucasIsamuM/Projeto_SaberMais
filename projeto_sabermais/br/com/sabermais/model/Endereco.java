package br.com.sabermais.model;

public class Endereco {
    private final String logradouro;
    private final int numero;
    private final int cep;
    private final String bairro;
    private final String cidade;
    private final String estado;
    private final String complemento;

    public Endereco(
            String logradouro;
            int numero;
            int cep;
            String bairro;
            String cidade;
            String estado;
            String complemento;
    ){

    if (logradouro == null )
        throw new IllegalArgumentException("Endereco invalido");

    if (cep <= 0)
        throw new IllegalArgumentException("CEP invalido");

    if (numero <= 0)
        throw new IllegalArgumentException("numero invalido");

    if (bairro == null || bairro.isBlank())
        throw new IllegalArgumentException("bairro invalido");

    if (cidade == null || cidade.isBlank())
        throw new IllegalArgumentException("cidade invalida");

    if (estado == null || estado.isBlank())
        throw new IllegalArgumentException("estado invalido");

    this.logradouro = logradouro;
    this.numero = numero;
    this.cep = cep;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.complemento = complemento;

    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public int getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento() {
        return complemento;
    }
}
