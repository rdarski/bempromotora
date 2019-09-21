
package modelo;

import java.time.LocalDate;

import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.ConveniosDoClienteEntity;
import modelo.PropostaEntity;

import java.util.List;




@Entity
@Table(name = "Cliente")
public class ClienteEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idCliente", referencedColumnName="idPessoasFisica")
	
	private PessoasFisicaEntity cliente;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "DataNascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "Bloqueado")
	private String bloqueado;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="cliente", cascade=CascadeType.ALL)
	private List<PropostaEntity> clienteProposta;
	
    	
	
  	@OneToOne(fetch = FetchType.LAZY,mappedBy="cliente", cascade=CascadeType.ALL)
	private ConveniosDoClienteEntity clienteConveniosDoCliente;
	
    	
	
	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
        	this.nome = nome;
	}
	public LocalDate getDataNascimento(){
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento){
        	this.dataNascimento = dataNascimento;
	}
	public String getBloqueado(){
		return this.bloqueado;
	}

	public void setBloqueado(String bloqueado){
        	this.bloqueado = bloqueado;
	}
	
  	public List<PropostaEntity> getClienteProposta(){
		return this.clienteProposta;
	};
	public void setClienteProposta(List<PropostaEntity> clienteProposta ){
		this.clienteProposta=clienteProposta;
	}
	
    	
	
  	public ConveniosDoClienteEntity getClienteConveniosDoCliente(){
		return this.clienteConveniosDoCliente;
	};
	public void setClienteConveniosDoCliente(ConveniosDoClienteEntity clienteConveniosDoCliente ){
		this.clienteConveniosDoCliente=clienteConveniosDoCliente;
	}
	
	
    	
	
	
	
	
	
}