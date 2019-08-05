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

	public SituacaoPropostaCredito getSituacao() {
		return this.situacao;
	}

	public void setSituacao(SituacaoPropostaCredito sit) {
		int sitid=10;
		//switch (situacao.id()) {
		switch (sitid) {
		case 10:
			if (!((sit.getId()==20)) || (sit.getId()==30) || (sit.getId()==101)) {
				return;
			}
			break;
/*		case 20:
			if (!((sit.equals(40)) || (sit.equals(21)) || (sit.equals(101)))) {
				try {
					throw new Exception("Status invalido");
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			}
			break;
		case 30:
			if (!((sit.equals(40)) || (sit.equals(21)) || (sit.equals(101)))) {
				try {
					throw new Exception("Status invalido");
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			}
			break; */
		default:
			sit=null;
		}

		this.situacao = sit;
	}


}
