package modelo.regravalidacao;

import modelo.AbstractEntity;

public class RegraValidacao extends AbstractEntity {

    private Long id;

    private String nome;

    private String valorComparacao;

    private OperadorRegraValidacao operador;

    private AtributoPropostaCredito atributo;

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

    public String getValorComparacao() {
        return valorComparacao;
    }

    public void setValorComparacao(String valorComparacao) {
        this.valorComparacao = valorComparacao;
    }

    public OperadorRegraValidacao getOperador() {
        return operador;
    }

    public void setOperador(OperadorRegraValidacao operador) {
        this.operador = operador;
    }

    public AtributoPropostaCredito getAtributo() {
        return atributo;
    }

    public void setAtributo(AtributoPropostaCredito atributo) {
        this.atributo = atributo;
    }
}
