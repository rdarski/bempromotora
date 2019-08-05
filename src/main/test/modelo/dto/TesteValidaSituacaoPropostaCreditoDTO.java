package modelo.dto;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import modelo.propostacredito.PropostaCredito;
import modelo.propostacredito.SituacaoPropostaCredito;

public class TesteValidaSituacaoPropostaCreditoDTO {
	//
	PropostaCredito proposta=getEmEdicao();
	

	@Test
	public void situacaoAberta() {
		getEmEdicao().setSituacao(SituacaoPropostaCredito.ABERTA);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.ABERTA, "Proposta não está aberta");
	}

	@Test
	public void situacaoSubmetidaParaAnalise() {
		proposta.setSituacao(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE,
				"Proposta não está aberta");
	}

	@Test
	public void situacaoPendenteAnalise() {
		proposta.setSituacao(SituacaoPropostaCredito.PENDENTE_DE_ANALISE);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.PENDENTE_DE_ANALISE,
				"Proposta não está aberta");
	}

	@Test
	public void situacaoAprovada() {
		proposta.setSituacao(SituacaoPropostaCredito.APROVADA);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.APROVADA, "Proposta não está analise");
	}

	@Test
	public void situacaoReprovada() {
		proposta.setSituacao(SituacaoPropostaCredito.REPROVADA);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.REPROVADA, "Proposta não está analise");
	}

	@Test
	public void situacaoCancelada() {
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.CANCELADA,
				"Proposta Nao pode ser cancelada");
	}

	@Test
	public void situacaoAnaliseNoConvenio() {
		proposta.setSituacao(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.ANALISE_NO_CONVENIO,
				"Proposta Nao pode ir ao convênio");
	}

	@Test
	public void situacaoReprovadaNoConvenio() {
		proposta.setSituacao(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.REPROVADA_NO_CONVENIO,
				"Convenio nao pode reprovar");
	}

	@Test
	public void situacaoProcessandoPagamento() {
		proposta.setSituacao(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO,
				"Não pode processar pagamento");
	}

	@Test
	public void situacaoPagamentoEfetuado() {
		proposta.setSituacao(SituacaoPropostaCredito.PAGAMENTO_EFETUADO);
		Assertions.assertEquals(proposta.getSituacao(), SituacaoPropostaCredito.PAGAMENTO_EFETUADO,
				"Não pode processar pagamento");
	}

	public PropostaCredito getEmEdicao() {
		return new PropostaCredito() {
			@Override
			public SituacaoPropostaCredito getSituacao() {
				SituacaoPropostaCredito sit=SituacaoPropostaCredito.EM_EDICAO;
				return sit;
			}
		};

	}

}
