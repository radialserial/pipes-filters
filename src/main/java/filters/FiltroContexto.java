package filters;

/**
 * Contexto que mantém os dados e resultados entre os filtros
 */
public class FiltroContexto {

    private boolean authenticated;
    private boolean validated;
    private Object contexto;

    public FiltroContexto() {
    }

    public FiltroContexto(boolean authenticated, boolean validated, Object contexto) {
        this.authenticated = authenticated;
        this.validated = validated;
        this.contexto = contexto;
    }

    public boolean estaAutenticado() {
        return authenticated;
    }

    public void autenticar(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean estaValido() {
        return validated;
    }

    public void validar(boolean validated) {
        this.validated = validated;
    }

    public Object getContexto() {
        return contexto;
    }

    public void setContexto(Object contexto) {
        this.contexto = contexto;
    }
}

