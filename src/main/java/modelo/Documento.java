package modelo;

import comum.Data;

public class Documento extends AbstractEntity{

    private Long id;

    private Data emissao;

    private String codigo;

    private String orgaoEmissor;

    private TipoDocumento tipoDocumento;

    private Arquivo anexo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getEmissao() {
        return emissao;
    }

    public void setEmissao(Data emissao) {
        this.emissao = emissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Arquivo getAnexo() {
        return anexo;
    }

    public void setAnexo(Arquivo anexo) {
        this.anexo = anexo;
    }
}
