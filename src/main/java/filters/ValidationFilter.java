package filters;

import java.util.concurrent.TimeUnit;

public class ValidationFilter implements Filter{

    @Override
    public void execute(ContextFilter contexto) {
        System.out.println("---------------- FILTRO DE VALIDAÇÃO ---------------");

        try {
            System.out.print("Validando usuário");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(".");
            System.out.println("/*----------------------------------------------------------*/");

            contexto.setValidated(true);
        } catch (InterruptedException e) {
            System.out.print("erro");
        }
    }
}
