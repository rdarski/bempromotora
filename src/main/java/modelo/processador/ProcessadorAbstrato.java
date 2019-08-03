package modelo.processador;

import arquitetura.BPLogicException;
import arquitetura.gerenciador.logico.IProcessador;
import arquitetura.transporte.DTO;

public abstract class ProcessadorAbstrato<Entrada extends DTO, Saida extends DTO> implements IProcessador<Entrada, Saida> {


    @Override
    public Saida processar(Entrada entrada) throws BPLogicException {
        return execucao(entrada);
    }

    protected abstract Saida execucao(Entrada entrada) throws BPLogicException;

}
