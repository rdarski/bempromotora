package modelo;

import comum.Data;

public class Notificacao extends AbstractEntity{

    private Long id;

    private String titulo;

    private String mensagem;

    private Data data;

    private Usuario emitente;

    private Usuario destinatario;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Usuario getEmitente() {
        return emitente;
    }

    public void setEmitente(Usuario emitente) {
        this.emitente = emitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }
}
