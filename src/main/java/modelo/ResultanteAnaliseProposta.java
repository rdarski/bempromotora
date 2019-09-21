package modelo;
 
public enum ResultanteAnaliseProposta {

    APROVADA("Aprovada"),
    REPROVADA("Reprovada");

    private String descricao;

    ResultanteAnaliseProposta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
