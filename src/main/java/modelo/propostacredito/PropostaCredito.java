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

	public void startSituacao(SituacaoPropostaCredito situacao) {
		this.situacao=situacao;
	}
	
	public void setSituacao(SituacaoPropostaCredito newsit) {
		if (situacao == null) {
			situacao = SituacaoPropostaCredito.EM_EDICAO;
		}

		switch (situacao) {
		case EM_EDICAO:
			if (newsit.equals(SituacaoPropostaCredito.ABERTA)) {
				this.situacao = newsit;
				break;
			}
		case ABERTA:
			if ((newsit.equals(SituacaoPropostaCredito.EM_EDICAO))
					|| (newsit.equals(SituacaoPropostaCredito.PENDENTE_DE_ANALISE))
					|| (newsit.equals(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE))
					|| (newsit.equals(SituacaoPropostaCredito.CANCELADA))) {
				this.situacao = newsit;
			}
			break;
		case PENDENTE_DE_ANALISE:
			if ((newsit.equals(SituacaoPropostaCredito.ABERTA))
					|| (newsit.equals(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE))
					|| (newsit.equals(SituacaoPropostaCredito.CANCELADA))) {
				this.situacao = newsit;
			}

			break;
		case SUBMETIDA_PARA_ANALISE:
			if ((newsit.equals(SituacaoPropostaCredito.ABERTA))
					|| (newsit.equals(SituacaoPropostaCredito.APROVADA))
					|| (newsit.equals(SituacaoPropostaCredito.REPROVADA))
					|| (newsit.equals(SituacaoPropostaCredito.CANCELADA))) {
				this.situacao = newsit;
			}

			break;
		case APROVADA:
			if ((newsit.equals(SituacaoPropostaCredito.ANALISE_NO_CONVENIO))
					|| (newsit.equals(SituacaoPropostaCredito.CANCELADA))) {
				this.situacao = newsit;
			}
			break;
		case ANALISE_NO_CONVENIO:
			if ((newsit.equals(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO))
					|| (newsit.equals(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO))
					|| (newsit.equals(SituacaoPropostaCredito.CANCELADA))) {
				this.situacao = newsit;
			}
			break;
		case PROCESSANDO_PAGAMENTO:
			if (newsit.equals(SituacaoPropostaCredito.PAGAMENTO_EFETUADO)) {
				this.situacao = newsit;
			}
			break;
		case REPROVADA:
			break;
		case CANCELADA:
			break;
		case REPROVADA_NO_CONVENIO:
			break;
		default:
			return;
		}
	}

}
