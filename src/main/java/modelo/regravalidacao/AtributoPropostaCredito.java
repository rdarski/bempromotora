package modelo.regravalidacao;

import modelo.AbstractEntity;

public class AtributoPropostaCredito extends AbstractEntity {

    private Long id;

    private String nome;

    private TipoAtrbituoPropostaCredito tipoAtributo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAtrbituoPropostaCredito getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(TipoAtrbituoPropostaCredito tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }
}
