package filters;

public class ValidationFilter implements Filter{

    @Override
    public void execute(ContextFilter contexto) {
        contexto.setValidated(true);
    }
}
