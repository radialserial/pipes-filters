package filtros;

import entidades.Bike;
import entidades.Cores;

/**
 * Verifica se a bicicleta tem uma cor compatível com as cores disponíveis na oficina.
 */
public class FiltroCorValida implements Filtro {
    @Override
    public void execute(Contexto contexto) {

        Bike bike = (Bike) contexto.getObjeto();

        System.out.println("Checando cor...");

        // Testando a cor da bicicleta em forma de caixa alta contra todas as cores disponíveis.
        boolean corValida = false;
        for (Cores cor : Cores.values()) {
            if (bike.cor().toUpperCase().equals(cor.toString())) corValida = true;
        }

        if (!corValida) throw new RuntimeException("Cor inválida.");


        System.out.println("Cor válida.\n");

    }
}
