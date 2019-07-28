package modelo.propostacredito;

import comum.Data;
import modelo.AbstractEntity;
import modelo.ResultanteAnaliseProposta;
import modelo.Usuario;
import modelo.propostacredito.PropostaCredito;

public class AnalisePropostaCredito extends AbstractEntity {

    private Long id;

    private ResultanteAnaliseProposta resultante;

    private PropostaCredito proposta;

    private Data quando;

    private Usuario analista;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResultanteAnaliseProposta getResultante() {
        return resultante;
    }

    public void setResultante(ResultanteAnaliseProposta resultante) {
        this.resultante = resultante;
    }

    public PropostaCredito getProposta() {
        return proposta;
    }

    public void setProposta(PropostaCredito proposta) {
        this.proposta = proposta;
    }

    public Data getQuando() {
        return quando;
    }

    public void setQuando(Data quando) {
        this.quando = quando;
    }

    public Usuario getAnalista() {
        return analista;
    }

    public void setAnalista(Usuario analista) {
        this.analista = analista;
    }
}
