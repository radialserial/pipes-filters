package filters;

import java.util.concurrent.TimeUnit;

public class FiltroAutenticacao implements Filtro {

    @Override
    public void execute(FiltroContexto contexto) {
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

            contexto.autenticar(true);
        } catch (InterruptedException e) {
            System.out.print("erro");
        }
    }
}

