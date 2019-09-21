
package modelo;

import java.time.LocalDate;

import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.TextosDoContratoEntity;

import java.util.List;




@Entity
@Table(name = "Clausula")
public class ClausulaEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idClausula_gen")
	@SequenceGenerator(name= "idClausula_gen", sequenceName="idClausula_seq", allocationSize =1)
	@Column(name = "idClausula", updatable = false, nullable = false)
	private Long idClausula;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataFinalDeVigencia")
	private LocalDate dataFinalDeVigencia;
	
	
  	@OneToOne(fetch = FetchType.LAZY,mappedBy="clausula", cascade=CascadeType.ALL)
	private TextosDoContratoEntity clausulaTextosDoContrato;
	
    	
	public Long getIdClausula(){
		return this.idClausula;
	}

    	public void setIdClausula(Long idClausula){
        	this.idClausula = idClausula;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public LocalDate getDataFinalDeVigencia(){
		return this.dataFinalDeVigencia;
	}

	public void setDataFinalDeVigencia(LocalDate dataFinalDeVigencia){
        	this.dataFinalDeVigencia = dataFinalDeVigencia;
	}
	
  	public TextosDoContratoEntity getClausulaTextosDoContrato(){
		return this.clausulaTextosDoContrato;
	};
	public void setClausulaTextosDoContrato(TextosDoContratoEntity clausulaTextosDoContrato ){
		this.clausulaTextosDoContrato=clausulaTextosDoContrato;
	}
	
	
    	
	
	
	
	
	
}