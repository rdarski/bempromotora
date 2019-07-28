package modelo.propostacredito;

import comum.Data;
import modelo.AbstractEntity;

public class EventoPropostaCredito extends AbstractEntity {

    private Long id;

    private Data quando;

    private String descricao;

    private PropostaCredito proposta;

    private TipoEventoPropostaCredito tipo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getQuando() {
        return quando;
    }

    public void setQuando(Data quando) {
        this.quando = quando;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PropostaCredito getProposta() {
        return proposta;
    }

    public void setProposta(PropostaCredito proposta) {
        this.proposta = proposta;
    }

    public TipoEventoPropostaCredito getTipo() {
        return tipo;
    }

    public void setTipo(TipoEventoPropostaCredito tipo) {
        this.tipo = tipo;
    }
}
