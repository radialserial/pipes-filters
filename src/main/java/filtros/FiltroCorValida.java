package filtros;

import entidades.Bike;
import entidades.Cores;

public class FiltroCorValida implements Filtro {
    @Override
    public void execute(Contexto contexto) {

        Bike bike = (Bike) contexto.getObjeto();

        System.out.println("Checando cor...");

        boolean corValida = false;
        for (Cores cor : Cores.values()) {
            if (bike.cor().toUpperCase().equals(cor.toString())) corValida = true;
        }

        if (!corValida) throw new RuntimeException("Cor inválida.");


        System.out.println("Cor válida.\n");

    }
}
