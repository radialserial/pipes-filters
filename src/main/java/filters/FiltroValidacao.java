package filters;

import java.util.concurrent.TimeUnit;

public class FiltroValidacao implements Filtro {

    @Override
    public void execute(FiltroContexto contexto) {
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

            contexto.validar(true);
        } catch (InterruptedException e) {
            System.out.print("erro");
        }
    }
}
