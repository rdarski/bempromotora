package arquitetura.gerenciador.logico;

import arquitetura.BPLogicException;
import arquitetura.transporte.DTO;

public interface IProcessador<Entrada extends DTO, Saida extends DTO> {

     Saida processar(Entrada entrada) throws BPLogicException;

     boolean aceita(Entrada entrada);
}
