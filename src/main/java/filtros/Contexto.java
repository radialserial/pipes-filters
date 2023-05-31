package filtros;

/**
 * Um contexto que serve para "carregar" o objeto que será analisado pelos filtros.
 */
public class Contexto {
    private final Object objeto;
    private boolean validadeCor;
    private boolean validadeId;
    private boolean validadeDono;

    public Contexto(Object objeto) {
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return this.objeto;
    }

    public void validarCor(boolean estado) {
        this.validadeCor = estado;
    }

    public void validarId(boolean estado) {
        this.validadeId = estado;
    }

    public void donoValido(boolean estado) {
        this.validadeDono = estado;
    }

    public boolean idValido() {
        return this.validadeId;
    }

    public boolean donoValido() {
        return this.validadeDono;
    }

    public boolean corValida() {
        return this.validadeCor;
    }
}
