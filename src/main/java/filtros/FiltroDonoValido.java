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

        contexto.donoValido(bike.dono() != null);


    }
}
