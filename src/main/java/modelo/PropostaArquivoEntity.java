
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;
import java.util.List;



@Entity
@Table(name = "PropostaArquivo")
public class PropostaArquivoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")
	
	private ArquivoEntity arquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProposta")
	private PropostaEntity proposta;
	
	
	public PropostaEntity getProposta(){
		return this.proposta;
	}

    	public void setProposta(PropostaEntity proposta){
        	this.proposta = proposta;
	}
	
	
	
	
	
}