
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.ConveniosDoClienteEntity;
import modelo.PropostaEntity;

import java.util.List;


 

@Entity
@Table(name = "Convenio")
public class ConvenioEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idConvenio_gen")
	@SequenceGenerator(name= "idConvenio_gen", sequenceName="idConvenio_seq", allocationSize =1)
	@Column(name = "idConvenio", updatable = false, nullable = false)
	private Long idConvenio;
	
	@Column(name = "Descricao")
	private String descricao;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="convenio", cascade=CascadeType.ALL)
	private List<PropostaEntity> convenioProposta;
	
    	
	
  	@OneToOne(fetch = FetchType.LAZY,mappedBy="convenio", cascade=CascadeType.ALL)
	private ConveniosDoClienteEntity convenioConveniosDoCliente;
	
    	
	public Long getIdConvenio(){
		return this.idConvenio;
	}

    	public void setIdConvenio(Long idConvenio){
        	this.idConvenio = idConvenio;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
  	public List<PropostaEntity> getConvenioProposta(){
		return this.convenioProposta;
	};
	public void setConvenioProposta(List<PropostaEntity> convenioProposta ){
		this.convenioProposta=convenioProposta;
	}
	
    	
	
  	public ConveniosDoClienteEntity getConvenioConveniosDoCliente(){
		return this.convenioConveniosDoCliente;
	};
	public void setConvenioConveniosDoCliente(ConveniosDoClienteEntity convenioConveniosDoCliente ){
		this.convenioConveniosDoCliente=convenioConveniosDoCliente;
	}
	
	
    	
	
	
	
	
	
}