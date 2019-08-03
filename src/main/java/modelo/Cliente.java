package modelo;

public class Cliente extends PessoaFisica {

    private ConvenioCliente convenio;

    public ConvenioCliente getConvenio() {
        return convenio;
    }

    public void setConvenio(ConvenioCliente convenio) {
        this.convenio = convenio;
    }
}
