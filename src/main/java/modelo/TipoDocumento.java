package modelo;

public enum TipoDocumento {

    CNH("Carteira Nacional de Habilitação"),
    IDENTIDADE_RG("Identidade Registro Geral"),
    CPF("Cadastro de Pessoa Física");

    private String descricao;

    TipoDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
