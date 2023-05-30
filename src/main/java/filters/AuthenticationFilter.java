package filters;

import java.util.concurrent.TimeUnit;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(ContextFilter contexto) {
        try {
            System.out.print("Autenticando");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");

            contexto.setAuthenticated(true);
        } catch (InterruptedException e) {

            System.out.print("erro");
        }
    }
}

