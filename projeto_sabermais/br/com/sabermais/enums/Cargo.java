package br.com.sabermais.enums;

public enum Cargo {
    GERENTE("Gerente"),
    SUBGERENTE("Subgerente"),
    ASSISTENTE_ADMINISTRATIVO("Assistente Administrativo"),
    VENDEDOR("Vendedor"),
    CAIXA("Caixa"),
    ESTOQUISTA("Estoquista"),
    AUXILIAR_LIMPEZA("Auxiliar de Limpeza"),
    EMPACOTADOR("Empacotador"),
    CURADOR_LIVROS("Curador de Livros"),
    COORDENADOR_MARKETING("Coordenador de Marketing"),
    SOCIAL_MEDIA("Social Media"),
    DESIGNER_GRAFICO("Designer Grafico");

    private final String descricao;

    Cargo(String descricao) {
        this.descricao = descricao;
    }

    public static Cargo fromDescricao(String descricao) {
        for (Cargo f : values()) {
            if (f.descricao.equalsIgnoreCase(descricao.trim())) {
                return f;
            }
        }
        throw new IllegalArgumentException("Selecione cargo listado: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
