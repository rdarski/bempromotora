package modelo;

import comum.Periodo;

public class Endereco extends AbstractEntity {

    private Long id;

    private Parceiro parceiro;

    private String logradouro;

    private String cep;

    private Periodo vigencia;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Periodo getVigencia() {
        return vigencia;
    }

    public void setVigencia(Periodo vigencia) {
        this.vigencia = vigencia;
    }
}
