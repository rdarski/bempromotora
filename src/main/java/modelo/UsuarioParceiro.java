package modelo;

import comum.Periodo;

public class UsuarioParceiro extends AbstractEntity {

    private Long id;

    private Usuario usuario;

    private Parceiro parceiro;

    private Periodo vigencia;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

    public Periodo getVigencia() {
        return vigencia;
    }

    public void setVigencia(Periodo vigencia) {
        this.vigencia = vigencia;
    }
}
