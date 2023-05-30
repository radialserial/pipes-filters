package filters;

import java.util.concurrent.TimeUnit;

public class ProcessingFilter implements  Filter{

    @Override
    public void execute(ContextFilter contexto) {

        System.out.println("---------------- FILTRO DE PROCESSAMENTO ---------------");

        try {
            System.out.print("PROCESSANDO");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(".");
            System.out.println("/*----------------------------------------------------------*/");

        } catch (InterruptedException e) {
            System.out.print("erro");
        }

        if (contexto.isAuthenticated() && contexto.isValidated()) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Pedido inválido. Não foi possível processar.");
        }
    }
}
