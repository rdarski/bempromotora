
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.ClienteEntity;
import modelo.UsuarioEntity;

import java.util.List;




@Entity
@Table(name = "PessoasFisica")
public class PessoasFisicaEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idParceiro", referencedColumnName="idParceiro")
	
	private ParceiroEntity parceiro;
	
	@Column(name = "CPF")
	private String cPF;
	
	@Column(name = "Funcionrio")
	private String funcionrio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFuncionarioDeRepresentante")
	private PessoaJuridicaEntity funcionarioDeRepresentante;
	
	
  	@OneToOne(fetch = FetchType.LAZY,mappedBy="cliente", cascade=CascadeType.ALL)
	private ClienteEntity clienteCliente;
	
    	
	
  	@OneToOne(fetch = FetchType.LAZY,mappedBy="usuario", cascade=CascadeType.ALL)
	private UsuarioEntity usuarioUsuario;
	
    	
		
	public String getCPF(){
		return this.cPF;
	}

	public void setCPF(String cPF){
        	this.cPF = cPF;
	}
	public String getFuncionrio(){
		return this.funcionrio;
	}

	public void setFuncionrio(String funcionrio){
        	this.funcionrio = funcionrio;
	}
	public PessoaJuridicaEntity getFuncionarioDeRepresentante(){
		return this.funcionarioDeRepresentante;
	}

    	public void setFuncionarioDeRepresentante(PessoaJuridicaEntity funcionarioDeRepresentante){
        	this.funcionarioDeRepresentante = funcionarioDeRepresentante;
	}
	
  	public ClienteEntity getClienteCliente(){
		return this.clienteCliente;
	};
	public void setClienteCliente(ClienteEntity clienteCliente ){
		this.clienteCliente=clienteCliente;
	}
	
	
    	
	
  	public UsuarioEntity getUsuarioUsuario(){
		return this.usuarioUsuario;
	};
	public void setUsuarioUsuario(UsuarioEntity usuarioUsuario ){
		this.usuarioUsuario=usuarioUsuario;
	}
	
	
    	
	
	
	
	
	
}