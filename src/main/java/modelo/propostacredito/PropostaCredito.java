package modelo.propostacredito;

import comum.Valor;
import modelo.*;

import java.util.Set;

public class PropostaCredito extends AbstractEntity {

    private Long id;

    private Long numero;

    private Valor valor;

    private SituacaoPropostaCredito situacao;

    private Convenio convenio;

    private Usuario criador;

    private Set<AnalisePropostaCredito> analises;

    private Set<ContratoPropostaCredito> contratos;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public Usuario getCriador() {
        return criador;
    }

    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

    public Set<AnalisePropostaCredito> getAnalises() {
        return analises;
    }

    public void setAnalises(Set<AnalisePropostaCredito> analises) {
        this.analises = analises;
    }

    public Set<ContratoPropostaCredito> getContratos() {
        return contratos;
    }

    public void setContratos(Set<ContratoPropostaCredito> contratos) {
        this.contratos = contratos;
    }
}
