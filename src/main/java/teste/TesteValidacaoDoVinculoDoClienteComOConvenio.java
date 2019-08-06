package teste;

import arquitetura.BPLogicException;
import modelo.Cliente;
import modelo.SituacaoConvenio;
import modelo.dto.ValidaVinculoDoClienteComOConvenioDTO;
import modelo.processador.ProcessadorQueValidaVinculoDoClienteComOConvenio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import teste.builder.ClienteBuilder;

public class TesteValidacaoDoVinculoDoClienteComOConvenio {

    private static ProcessadorQueValidaVinculoDoClienteComOConvenio processador;

    @BeforeAll
    public static void init(){
        processador = new ProcessadorQueValidaVinculoDoClienteComOConvenio();
    }

    @Test
    public void clienteConvenioInexistente() throws BPLogicException {
        Cliente clienteSemConvenio = ClienteBuilder.semConvenio();
        ValidaVinculoDoClienteComOConvenioDTO validacao = new ValidaVinculoDoClienteComOConvenioDTO(clienteSemConvenio);
        ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO retorno = processador.processar(validacao);
        Boolean possuiVinculoValido = retorno.getPossuiVinculoValido();
        Assertions.assertEquals(possuiVinculoValido, false, "Vínculo de convênio deve ser inválido quando inexistente");
    }

    @Test
    public void clienteConvenioInativo() throws BPLogicException {
        Cliente clienteComConvenioInativo = ClienteBuilder.comStiuacaoDeConvenio(SituacaoConvenio.INATIVO);
        ValidaVinculoDoClienteComOConvenioDTO validacao = new ValidaVinculoDoClienteComOConvenioDTO(clienteComConvenioInativo);
        ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO retorno = processador.processar(validacao);
        Boolean possuiVinculoValido = retorno.getPossuiVinculoValido();
        Assertions.assertEquals(possuiVinculoValido, false, "Vínculo de convênio deve ser inválido quando inativo");

    }

    @Test
    public void clienteConvenioAtivo() throws BPLogicException {
        Cliente clienteComConvenioAtivo = ClienteBuilder.comStiuacaoDeConvenio(SituacaoConvenio.ATIVO);
        ValidaVinculoDoClienteComOConvenioDTO validacao = new ValidaVinculoDoClienteComOConvenioDTO(clienteComConvenioAtivo);
        ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO retorno = processador.processar(validacao);
        Boolean possuiVinculoValido = retorno.getPossuiVinculoValido();
        Assertions.assertEquals(possuiVinculoValido, true, "Vínculo de convênio deve ser válido quando ativo");
    }

}
