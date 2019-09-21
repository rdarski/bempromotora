
package modelo;
 

import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;
import java.util.List;

@Entity
@Table(name = "DocumentoArquivo")
public class DocumentoArquivoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")
	
	private ArquivoEntity arquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idDocumento")
	private DocumentoEntity documento;
	
	
	public DocumentoEntity getDocumento(){
		return this.documento;
	}

    	public void setDocumento(DocumentoEntity documento){
        	this.documento = documento;
	}
	
	
	
	
	
}