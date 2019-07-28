package modelo.propostacredito;

public enum SituacaoPropostaCredito {

    ABERTA("Aberta"),
    SUBMETIDA_PARA_ANALISE("Submetida para análise"),
    PENDENTE_DE_ANALISE("Pendente de Análise"),
    EM_ANALISE("Em análise"),
    APROVADA("Aprovada"),
    REPROVADA("Reprovada"),
    CANCELADA("Cancelada"),
    AGUARDANDO_ASSINATURA("Aguardando Assinatura"),
    ASSINADA("Assinada"),
    PROCESSANDO_PAGAMENTO("Processando Pagamento"),
    PAGAMENTO_EFETUADO("Pagamento Efetuado"),
    QUITADA("Quitada");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    SituacaoPropostaCredito(String descricao) {
        this.descricao = descricao;
    }
}
