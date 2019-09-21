
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.EvolucoesDaPropostaEntity;
import modelo.PropostaEntity;

import java.util.List;




@Entity
@Table(name = "SituacoesDaProposta")
public class SituacoesDaPropostaEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idSituacao_gen")
	@SequenceGenerator(name= "idSituacao_gen", sequenceName="idSituacao_seq", allocationSize =1)
	@Column(name = "idSituacao", updatable = false, nullable = false)
	private Long idSituacao;
	
	@Column(name = "Descricao")
	private String descricao;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="situacao", cascade=CascadeType.ALL)
	private List<PropostaEntity> situacaoProposta;
	
    	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="situacao", cascade=CascadeType.ALL)
	private List<EvolucoesDaPropostaEntity> situacaoEvolucoesDaProposta;
	
    	
	public Long getIdSituacao(){
		return this.idSituacao;
	}

    	public void setIdSituacao(Long idSituacao){
        	this.idSituacao = idSituacao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
  	public List<PropostaEntity> getSituacaoProposta(){
		return this.situacaoProposta;
	};
	public void setSituacaoProposta(List<PropostaEntity> situacaoProposta ){
		this.situacaoProposta=situacaoProposta;
	}
	
    	
	
  	public List<EvolucoesDaPropostaEntity> getSituacaoEvolucoesDaProposta(){
		return this.situacaoEvolucoesDaProposta;
	};
	public void setSituacaoEvolucoesDaProposta(List<EvolucoesDaPropostaEntity> situacaoEvolucoesDaProposta ){
		this.situacaoEvolucoesDaProposta=situacaoEvolucoesDaProposta;
	}
	
    	
	
	
	
	
	
}