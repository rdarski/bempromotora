
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;
import java.util.List;




@Entity
@Table(name = "TextosDoContrato")
public class TextosDoContratoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idVersaoModelo", referencedColumnName="idVersoesContrato")
	
	private VersoesContratoEntity versaoModelo;
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idClausula", referencedColumnName="idClausula")
	
	private ClausulaEntity clausula;
	
	@Column(name = "Ordem")
	private String ordem;
			
	public String getOrdem(){
		return this.ordem;
	}

	public void setOrdem(String ordem){
        	this.ordem = ordem;
	}
	
	
	
	
	
}