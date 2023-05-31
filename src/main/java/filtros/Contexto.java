package filtros;

/**
 * Um contexto que serve para "carregar" o objeto que será analisado pelos filtros.
 */
public class Contexto {
    private final Object objeto;

    public Contexto(Object objeto) {
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return this.objeto;
    }

}
