package modelo.propostacredito;

import modelo.AbstractEntity;

public class TipoEventoSituacaoValidaPropostaCredito extends AbstractEntity {

    private Long id;

    private SituacaoPropostaCredito situacao;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SituacaoPropostaCredito getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPropostaCredito situacao) {
        this.situacao = situacao;
    }
}
