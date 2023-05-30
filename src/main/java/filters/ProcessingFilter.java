package filters;

public class ProcessingFilter implements  Filter{

    @Override
    public void execute(ContextFilter contexto) {

        if (contexto.isAuthenticated() && contexto.isValidated()) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Pedido inválido. Não foi possível processar.");
        }
    }
}
