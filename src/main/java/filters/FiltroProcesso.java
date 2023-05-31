package filters;

import java.util.concurrent.TimeUnit;

public class FiltroProcesso implements Filtro {

    @Override
    public void execute(FiltroContexto contexto) {

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

        if (contexto.estaAutenticado() && contexto.estaValido()) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Pedido inválido. Não foi possível processar.");
        }
    }
}
