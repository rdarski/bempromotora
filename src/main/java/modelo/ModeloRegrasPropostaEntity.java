
package modelo;

import java.time.LocalDate;

import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.PropostaEntity;
import modelo.RegraEntity;

import java.util.List;




@Entity
@Table(name = "ModeloRegrasProposta")
public class ModeloRegrasPropostaEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idModeloDeRegra_gen")
	@SequenceGenerator(name= "idModeloDeRegra_gen", sequenceName="idModeloDeRegra_seq", allocationSize =1)
	@Column(name = "idModeloDeRegra", updatable = false, nullable = false)
	private Long idModeloDeRegra;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataInicioVigencia")
	private LocalDate dataInicioVigencia;
	
	@Column(name = "DataFimVigencia")
	private LocalDate dataFimVigencia;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="modelodeRegra", cascade=CascadeType.ALL)
	private List<RegraEntity> modelodeRegraRegra;
	
    	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="modelodeRegra", cascade=CascadeType.ALL)
	private List<PropostaEntity> modelodeRegraProposta;
	
    	
	public Long getIdModeloDeRegra(){
		return this.idModeloDeRegra;
	}

    	public void setIdModeloDeRegra(Long idModeloDeRegra){
        	this.idModeloDeRegra = idModeloDeRegra;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public LocalDate getDataInicioVigencia(){
		return this.dataInicioVigencia;
	}

	public void setDataInicioVigencia(LocalDate dataInicioVigencia){
        	this.dataInicioVigencia = dataInicioVigencia;
	}
	public LocalDate getDataFimVigencia(){
		return this.dataFimVigencia;
	}

	public void setDataFimVigencia(LocalDate dataFimVigencia){
        	this.dataFimVigencia = dataFimVigencia;
	}
	
  	public List<RegraEntity> getModelodeRegraRegra(){
		return this.modelodeRegraRegra;
	};
	public void setModelodeRegraRegra(List<RegraEntity> modelodeRegraRegra ){
		this.modelodeRegraRegra=modelodeRegraRegra;
	}
	
    	
	
  	public List<PropostaEntity> getModelodeRegraProposta(){
		return this.modelodeRegraProposta;
	};
	public void setModelodeRegraProposta(List<PropostaEntity> modelodeRegraProposta ){
		this.modelodeRegraProposta=modelodeRegraProposta;
	}
	
    	
	
	
	
	
	
}