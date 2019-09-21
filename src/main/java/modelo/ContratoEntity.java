
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.ContratoArquivoEntity;
import modelo.PropostaEntity;

import java.util.List;




@Entity
@Table(name = "Contrato")
public class ContratoEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idContrato_gen")
	@SequenceGenerator(name= "idContrato_gen", sequenceName="idContrato_seq", allocationSize =1)
	@Column(name = "idContrato", updatable = false, nullable = false)
	private Long idContrato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idVersao")
	private VersoesContratoEntity versao;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato", cascade=CascadeType.ALL)
	private List<ContratoArquivoEntity> contratoContratoArquivo;
	
    	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato", cascade=CascadeType.ALL)
	private List<PropostaEntity> contratoProposta;
	
    	
	public Long getIdContrato(){
		return this.idContrato;
	}

    	public void setIdContrato(Long idContrato){
        	this.idContrato = idContrato;
	}
	
	public VersoesContratoEntity getVersao(){
		return this.versao;
	}

    	public void setVersao(VersoesContratoEntity versao){
        	this.versao = versao;
	}
	
  	public List<ContratoArquivoEntity> getContratoContratoArquivo(){
		return this.contratoContratoArquivo;
	};
	public void setContratoContratoArquivo(List<ContratoArquivoEntity> contratoContratoArquivo ){
		this.contratoContratoArquivo=contratoContratoArquivo;
	}
	
    	
	
  	public List<PropostaEntity> getContratoProposta(){
		return this.contratoProposta;
	};
	public void setContratoProposta(List<PropostaEntity> contratoProposta ){
		this.contratoProposta=contratoProposta;
	}
	
    	
	
	
	
	
	
}