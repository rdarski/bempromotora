
package modelo;


import javax.persistence.*;
import org.dom4j.tree.AbstractEntity;

import modelo.PessoasFisicaEntity;

import java.util.List;

 


@Entity
@Table(name = "PessoaJuridica")
public class PessoaJuridicaEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idParceiro", referencedColumnName="idParceiro")
	
	private ParceiroEntity parceiro;
	
	@Column(name = "CNPJ")
	private String cNPJ;
	
	@Column(name = "RazaoSocial")
	private String razaoSocial;
	
	@Column(name = "Representante")
	private String representante;
	
	
  	@OneToMany(fetch = FetchType.LAZY, mappedBy="funcionarioDeRepresentante", cascade=CascadeType.ALL)
	private List<PessoasFisicaEntity> funcionarioDeRepresentantePessoasFisica;
	
    public String getCNPJ(){
		return this.cNPJ;
	}

	public void setCNPJ(String cNPJ){
        	this.cNPJ = cNPJ;
	}
	public String getRazaoSocial(){
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial){
        	this.razaoSocial = razaoSocial;
	}
	public String getRepresentante(){
		return this.representante;
	}

	public void setRepresentante(String representante){
        	this.representante = representante;
	}
	
  	public List<PessoasFisicaEntity> getFuncionarioDeRepresentantePessoasFisica(){
		return this.funcionarioDeRepresentantePessoasFisica;
	};
	public void setFuncionarioDeRepresentantePessoasFisica(List<PessoasFisicaEntity> funcionarioDeRepresentantePessoasFisica ){
		this.funcionarioDeRepresentantePessoasFisica=funcionarioDeRepresentantePessoasFisica;
	}
	
    	
	
	
	
	
	
}