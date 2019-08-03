package modelo;

public class ConvenioCliente {

    private Convenio convenio;

    private Cliente cliente;

    private SituacaoConvenio situacao;

    public ConvenioCliente(Convenio convenio, Cliente cliente, SituacaoConvenio situacao) {
        this.convenio = convenio;
        this.cliente = cliente;
        this.situacao = situacao;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SituacaoConvenio getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoConvenio situacao) {
        this.situacao = situacao;
    }
}
