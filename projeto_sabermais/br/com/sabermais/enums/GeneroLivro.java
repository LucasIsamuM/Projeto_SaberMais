package br.com.sabermais.enums;

public class GeneroLivro {
    ROMANCE("Romance"),
    FANTASIA("Fantasia"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    TERROR("Terror"),
    SUSPENSE_THRILLER("Suspense/Thriller"),
    MISTERIO_POLICIAL("Mistério/Policial"),
    AVENTURA("Aventura"),
    DRAMA("Drama"),
    HISTORICO("Histórico"),
    DISTOPIA("Distopia"),
    REALISMO_MAGICO("Realismo mágico"),
    BIOGRAFIA_AUTOBIOGRAFIA("Biografia/Autobiografia"),
    AUTOAJUDA("Autoajuda"),
    FILOSOFIA("Filosofia"),
    SOCIOLOGIA("Sociologia"),
    PSICOLOGIA("Psicologia"),
    DIDATICO("Didático"),
    CIENCIA_DIVULGACAO_CIENTIFICA("Ciência/Divulgação Científica"),
    RELIGIAO("Religião"),
    POLITICA("Política"),
    ENSAIO_CRITICA("Ensaio/Crítica"),
    GASTRONOMIA("Gastronomia"),
    EMPREENDEDORISMO("Empreendedorismo"),
    JORNALISMO_LITERARIO("Jornalismo Literário"),
    LITERATURA_JUVENIL("Literatura Juvenil"),
    INFANTIL("Infantil"),
    OUTROS("Outros");

    private final String descricao;

    GeneroLivro(String descricao) {
        this.descricao = descricao;
    }

    public static GeneroLivro fromDescricao(String descricao) {
        for (GeneroLivro f : values()) {
            if (f.descricao.equalsIgnoreCase(descricao.trim())) {
                return f;
            }
        }
        throw new IllegalArgumentException("Gênero de livro desconhecido: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}