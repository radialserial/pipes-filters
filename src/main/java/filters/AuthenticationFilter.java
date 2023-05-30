package filters;

import java.util.concurrent.TimeUnit;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(ContextFilter contexto) {
        System.out.println("---------------- FILTRO DE AUTENTICAÇÃO ---------------");

        try {
            System.out.print("Autenticando");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(".");
            System.out.println("/*----------------------------------------------------------*/");

            contexto.setAuthenticated(true);
        } catch (InterruptedException e) {
            System.out.print("erro");
        }
    }
}

