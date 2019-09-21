
package modelo;

import java.time.LocalDate;
import java.math.BigDecimal;
import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.EvolucoesDaPropostaEntity;
import modelo.PropostaArquivoEntity;

import java.util.List;






@Entity
@Table(name = "Proposta")
public class PropostaEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idProposta_gen")
	@SequenceGenerator(name= "idProposta_gen", sequenceName="idProposta_seq", allocationSize =1)
	@Column(name = "idProposta", updatable = false, nullable = false)
	private Long idProposta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idModelodeRegra")
	private ModeloRegrasPropostaEntity modelodeRegra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idSituacao")
	private SituacoesDaPropostaEntity situacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConvenio")
	private ConvenioEntity convenio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idContrato")
	private ContratoEntity contrato;
	
	@Column(name = "Valor")
	private BigDecimal valor;
	
	@Column(name = "Data")
	private LocalDate data;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private UsuarioEntity usuario;
	
	@Column(name = "ProtocolodoConvenio")
	private String protocolodoConvenio;
	
	@Column(name = "Observacao")
	private String observacao;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="proposta", cascade=CascadeType.ALL)
	private List<PropostaArquivoEntity> propostaPropostaArquivo;
	
    	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="proposta", cascade=CascadeType.ALL)
	private List<EvolucoesDaPropostaEntity> propostaEvolucoesDaProposta;
	
    	
	public Long getIdProposta(){
		return this.idProposta;
	}

    	public void setIdProposta(Long idProposta){
        	this.idProposta = idProposta;
	}
	
	public ModeloRegrasPropostaEntity getModelodeRegra(){
		return this.modelodeRegra;
	}

    	public void setModelodeRegra(ModeloRegrasPropostaEntity modelodeRegra){
        	this.modelodeRegra = modelodeRegra;
	}
	public SituacoesDaPropostaEntity getSituacao(){
		return this.situacao;
	}

    	public void setSituacao(SituacoesDaPropostaEntity situacao){
        	this.situacao = situacao;
	}
	public ConvenioEntity getConvenio(){
		return this.convenio;
	}

    	public void setConvenio(ConvenioEntity convenio){
        	this.convenio = convenio;
	}
	public ContratoEntity getContrato(){
		return this.contrato;
	}

    	public void setContrato(ContratoEntity contrato){
        	this.contrato = contrato;
	}
	public BigDecimal getValor(){
		return this.valor;
	}

	public void setValor(BigDecimal valor){
        	this.valor = valor;
	}
	public LocalDate getData(){
		return this.data;
	}

	public void setData(LocalDate data){
        	this.data = data;
	}
	public UsuarioEntity getUsuario(){
		return this.usuario;
	}

    	public void setUsuario(UsuarioEntity usuario){
        	this.usuario = usuario;
	}
	public String getProtocolodoConvenio(){
		return this.protocolodoConvenio;
	}

	public void setProtocolodoConvenio(String protocolodoConvenio){
        	this.protocolodoConvenio = protocolodoConvenio;
	}
	public String getObservacao(){
		return this.observacao;
	}

	public void setObservacao(String observacao){
        	this.observacao = observacao;
	}
	
  	public List<PropostaArquivoEntity> getPropostaPropostaArquivo(){
		return this.propostaPropostaArquivo;
	};
	public void setPropostaPropostaArquivo(List<PropostaArquivoEntity> propostaPropostaArquivo ){
		this.propostaPropostaArquivo=propostaPropostaArquivo;
	}
	
    	
	
  	public List<EvolucoesDaPropostaEntity> getPropostaEvolucoesDaProposta(){
		return this.propostaEvolucoesDaProposta;
	};
	public void setPropostaEvolucoesDaProposta(List<EvolucoesDaPropostaEntity> propostaEvolucoesDaProposta ){
		this.propostaEvolucoesDaProposta=propostaEvolucoesDaProposta;
	}
	
    	
	
	
	
	
	
}