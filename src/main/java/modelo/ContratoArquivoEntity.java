
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;
import java.util.List;

@Entity
@Table(name = "ContratoArquivo")
public class ContratoArquivoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")
	
	private ArquivoEntity arquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idContrato")
	private ContratoEntity contrato;
	

	
	public ContratoEntity getContrato(){
		return this.contrato;
	}

    	public void setContrato(ContratoEntity contrato){
        	this.contrato = contrato;
	}
	
	
	
	
	
}