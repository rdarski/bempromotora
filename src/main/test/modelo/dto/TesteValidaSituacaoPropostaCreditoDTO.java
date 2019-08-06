package modelo.dto;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import modelo.propostacredito.PropostaCredito;
import modelo.propostacredito.SituacaoPropostaCredito;

public class TesteValidaSituacaoPropostaCreditoDTO {
	//
	PropostaCredito proposta = new PropostaCredito();

	@Test
	public void situacaoAberta() {
		// caminho feliz
		proposta = instaceProposta(SituacaoPropostaCredito.EM_EDICAO);
		proposta.setSituacao(SituacaoPropostaCredito.ABERTA);
		Assertions.assertEquals(SituacaoPropostaCredito.ABERTA, proposta.getSituacao(), "Proposta não está aberta");
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.EM_EDICAO);
		proposta.setSituacao(SituacaoPropostaCredito.APROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCredito.APROVADA, proposta.getSituacao(), "Proposta não está aberta");

	}

	@Test
	public void situacaoPendenteAnalise() {
		proposta = instaceProposta(SituacaoPropostaCredito.ABERTA);
		proposta.setSituacao(SituacaoPropostaCredito.PENDENTE_DE_ANALISE);
		Assertions.assertEquals(SituacaoPropostaCredito.PENDENTE_DE_ANALISE, proposta.getSituacao(),
				"Proposta não está aberta");
		
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.ABERTA);
		proposta.setSituacao(SituacaoPropostaCredito.APROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCredito.APROVADA, proposta.getSituacao(), "Proposta está aberta");

		
	}

	@Test
	public void situacaoSubmetidaParaAnalise() {
		proposta = instaceProposta(SituacaoPropostaCredito.ABERTA);
		proposta.setSituacao(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		Assertions.assertEquals(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE, proposta.getSituacao(),
				"Proposta não está aberta");
		proposta = instaceProposta(SituacaoPropostaCredito.PENDENTE_DE_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		Assertions.assertEquals(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE, proposta.getSituacao(),
				"Proposta não está pendente");
		
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.PENDENTE_DE_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.APROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE, proposta.getSituacao(),
				"Proposta não está pendente");

		
	}

	@Test
	public void situacaoAprovada() {
		proposta = instaceProposta(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.APROVADA);
		Assertions.assertEquals(SituacaoPropostaCredito.APROVADA, proposta.getSituacao(), "Proposta não está analise");
		
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO);
		Assertions.assertNotEquals(SituacaoPropostaCredito.APROVADA, proposta.getSituacao(), "Proposta não está analise");

	}

	@Test
	public void situacaoReprovada() {
		proposta = instaceProposta(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.REPROVADA);
		Assertions.assertEquals(SituacaoPropostaCredito.REPROVADA, proposta.getSituacao(), "Proposta não está analise");
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.APROVADA);
		proposta.setSituacao(SituacaoPropostaCredito.REPROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCredito.REPROVADA, proposta.getSituacao(), "Proposta está aprovada");

	}

	@Test
	public void situacaoCancelada() {
		proposta = instaceProposta(SituacaoPropostaCredito.ABERTA);
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCredito.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCredito.PENDENTE_DE_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCredito.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCredito.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCredito.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCredito.APROVADA);
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCredito.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCredito.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");

		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.PAGAMENTO_EFETUADO);
		proposta.setSituacao(SituacaoPropostaCredito.CANCELADA);
		Assertions.assertNotEquals(SituacaoPropostaCredito.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");

	}

	@Test
	public void situacaoAnaliseNoConvenio() {
		proposta = instaceProposta(SituacaoPropostaCredito.APROVADA);
		proposta.setSituacao(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		Assertions.assertEquals(SituacaoPropostaCredito.ANALISE_NO_CONVENIO, proposta.getSituacao(),
				"Proposta Nao pode ir ao convênio");
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.REPROVADA);
		proposta.setSituacao(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		Assertions.assertNotEquals(SituacaoPropostaCredito.ANALISE_NO_CONVENIO, proposta.getSituacao(),
				"Proposta Nao pode ir ao convênio");		
	}

	@Test
	public void situacaoReprovadaNoConvenio() {
		proposta = instaceProposta(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO);
		Assertions.assertEquals(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO, proposta.getSituacao(),
				"Convenio nao pode reprovar");
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO);
		proposta.setSituacao(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO);
		Assertions.assertNotEquals(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO, proposta.getSituacao(),
				"Convenio nao pode reprovar");

	}

	@Test
	public void situacaoProcessandoPagamento() {
		proposta = instaceProposta(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO);
		Assertions.assertEquals(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO, proposta.getSituacao(),
				"Não pode processar pagamento");
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.REPROVADA_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO);
		Assertions.assertNotEquals(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO, proposta.getSituacao(),
				"Não pode processar pagamento");

		
	}

	@Test
	public void situacaoPagamentoEfetuado() {
		proposta = instaceProposta(SituacaoPropostaCredito.PROCESSANDO_PAGAMENTO);
		proposta.setSituacao(SituacaoPropostaCredito.PAGAMENTO_EFETUADO);
		Assertions.assertEquals(SituacaoPropostaCredito.PAGAMENTO_EFETUADO, proposta.getSituacao(),
				"Não pode processar pagamento");
		//fail
		proposta = instaceProposta(SituacaoPropostaCredito.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCredito.PAGAMENTO_EFETUADO);
		Assertions.assertNotEquals(SituacaoPropostaCredito.PAGAMENTO_EFETUADO, proposta.getSituacao(),
				"Não pode processar pagamento");

	}

	public PropostaCredito instaceProposta(SituacaoPropostaCredito situacao) {
		PropostaCredito proposta = new PropostaCredito();
		proposta.startSituacao(situacao);
		return  proposta;
	}

}
