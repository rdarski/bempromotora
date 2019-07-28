package modelo.propostacredito;

import modelo.AbstractEntity;

import java.util.Set;

public class TipoEventoPropostaCredito extends AbstractEntity {

    private Long id;

    private String descricao;

    private Set<TipoEventoSituacaoValidaPropostaCredito> situacoesValidas;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<TipoEventoSituacaoValidaPropostaCredito> getSituacoesValidas() {
        return situacoesValidas;
    }

    public void setSituacoesValidas(Set<TipoEventoSituacaoValidaPropostaCredito> situacoesValidas) {
        this.situacoesValidas = situacoesValidas;
    }
}
