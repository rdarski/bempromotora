
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.EvolucoesDaPropostaEntity;
import modelo.PropostaEntity;

import java.util.List;




@Entity
@Table(name = "Usuario")
public class UsuarioEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idUsuario", referencedColumnName="idPessoasFisica")
	
	private PessoasFisicaEntity usuario;
	
	@Column(name = "Senha")
	private String senha;
	
	@Column(name = "Ativo")
	private String ativo;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", cascade=CascadeType.ALL)
	private List<PropostaEntity> usuarioProposta;
	
    	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", cascade=CascadeType.ALL)
	private List<EvolucoesDaPropostaEntity> usuarioEvolucoesDaProposta;
	
    	
	
	public String getSenha(){
		return this.senha;
	}

	public void setSenha(String senha){
        	this.senha = senha;
	}
	public String getAtivo(){
		return this.ativo;
	}

	public void setAtivo(String ativo){
        	this.ativo = ativo;
	}
	
  	public List<PropostaEntity> getUsuarioProposta(){
		return this.usuarioProposta;
	};
	public void setUsuarioProposta(List<PropostaEntity> usuarioProposta ){
		this.usuarioProposta=usuarioProposta;
	}
	
    	
	
  	public List<EvolucoesDaPropostaEntity> getUsuarioEvolucoesDaProposta(){
		return this.usuarioEvolucoesDaProposta;
	};
	public void setUsuarioEvolucoesDaProposta(List<EvolucoesDaPropostaEntity> usuarioEvolucoesDaProposta ){
		this.usuarioEvolucoesDaProposta=usuarioEvolucoesDaProposta;
	}
	
    	
	
	
	
	
	
}