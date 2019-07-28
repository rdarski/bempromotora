package modelo;

public class Cliente extends PessoaFisica {

    private Convenio convenio;

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
}
