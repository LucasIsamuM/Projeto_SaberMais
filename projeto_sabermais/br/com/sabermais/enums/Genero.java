package br.com.sabermais.enums;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    OUTRO("Outro"),
    PREFIRONAODIZER("Prefiro não dizer");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public static Genero fromDescricao(String descricao) {
        for (Genero f : values()) {
            if (f.descricao.equalsIgnoreCase(descricao.trim())) {
                return f;
            }
        }
        throw new IllegalArgumentException("Selecione gênero listado: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}