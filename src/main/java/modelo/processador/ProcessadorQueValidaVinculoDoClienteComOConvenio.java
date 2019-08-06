package modelo.processador;

import arquitetura.BPLogicException;
import arquitetura.util.ConfirmaQue;
import modelo.Cliente;
import modelo.Convenio;
import modelo.ConvenioCliente;
import modelo.SituacaoConvenio;
import modelo.dto.ValidaVinculoDoClienteComOConvenioDTO;
//import sun.plugin2.message.Message;

import java.text.MessageFormat;
import java.util.List;

public class ProcessadorQueValidaVinculoDoClienteComOConvenio
    extends ProcessadorAbstrato<ValidaVinculoDoClienteComOConvenioDTO, ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO>{

    private Cliente cliente;
    private Boolean vinculoValido;
    private String motivoQuandoNaoEhValido;
    private boolean clienteNaoTemConvenio;

    @Override
    public boolean aceita(ValidaVinculoDoClienteComOConvenioDTO entrada) {
        return true;
    }

    @Override
    protected ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO execucao(ValidaVinculoDoClienteComOConvenioDTO entrada) throws BPLogicException {
        guardarLocalmente(entrada);
        validarConvenio();
        return new ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO(vinculoValido, motivoQuandoNaoEhValido);
    }

    private void guardarLocalmente(ValidaVinculoDoClienteComOConvenioDTO entrada) {
        cliente = entrada.getCliente();
    }

    private void validarConvenio() {

        vinculoValido = false;
        ConvenioCliente convenioCliente = cliente.getConvenio();
        clienteNaoTemConvenio = ConfirmaQue.ehNulo(convenioCliente);

        if(clienteNaoTemConvenio) {
            motivoQuandoNaoEhValido = "Convênio inexistente";
            return;
        }

        SituacaoConvenio situacao = convenioCliente.getSituacao();
        boolean convenioAtivo = false;
        switch (situacao) {
            case ATIVO:
                convenioAtivo = true;
                break;
            default:
                break;
        }

        if(!convenioAtivo){
            Convenio convenio = convenioCliente.getConvenio();
            motivoQuandoNaoEhValido = MessageFormat.format("Convênio {0} inativo", convenio.getDescricao());
            return;
        }

        vinculoValido = true;

    }
}
