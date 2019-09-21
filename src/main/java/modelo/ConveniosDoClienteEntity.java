
package modelo;

import java.time.LocalDate;

import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;
import java.util.List;





@Entity
@Table(name = "ConveniosDoCliente")
public class ConveniosDoClienteEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idCliente", referencedColumnName="idCliente")
	
	private ClienteEntity cliente;
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConvenio", referencedColumnName="idConvenio")
	
	private ConvenioEntity convenio;
	
	@Column(name = "Matricula")
	private String matricula;
	
	@Column(name = "DataEntrada")
	private LocalDate dataEntrada;
	
	@Column(name = "DataFim")
	private LocalDate dataFim;
	
	
	public String getMatricula(){
		return this.matricula;
	}

	public void setMatricula(String matricula){
        	this.matricula = matricula;
	}
	public LocalDate getDataEntrada(){
		return this.dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada){
        	this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataFim(){
		return this.dataFim;
	}

	public void setDataFim(LocalDate dataFim){
        	this.dataFim = dataFim;
	}
	
	
	
	
	
}