package modelo.propostacredito;

import comum.Data;
import modelo.AbstractEntity;
import modelo.Arquivo;

public class ContratoPropostaCredito extends AbstractEntity {

    private Long id;

    private Data emissao;

    private Data validade;

    private Arquivo arquivo;

    private PropostaCredito proposta;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getEmissao() {
        return emissao;
    }

    public void setEmissao(Data emissao) {
        this.emissao = emissao;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public PropostaCredito getProposta() {
        return proposta;
    }

    public void setProposta(PropostaCredito proposta) {
        this.proposta = proposta;
    }
}
