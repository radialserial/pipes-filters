package filtros;

import entidades.Bike;

/**
 * Testa se o dono da bicicleta foi declarado.
 */
public class FiltroDonoValido implements Filtro {
    @Override
    public void execute(Contexto contexto) {

        Bike bike = (Bike) contexto.getObjeto();

        System.out.println("Checando nome do dono...");

        if (bike.dono() == null) {
            throw new RuntimeException("Bike sem dono");
        }

        System.out.println("Dono encontrado.\n");

    }
}
