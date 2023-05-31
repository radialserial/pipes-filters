package filtros;

import entidades.Bike;

/**
 * Checa se a bicicleta tem um ID válido (quatro caracteres alfanuméricos).
 */
public class FiltroIdValido implements Filtro {
    @Override
    public void execute(Contexto contexto) {

        Bike bike = (Bike) contexto.getObjeto();

        System.out.println("Checando ID...");

        if (bike.id().length() != 4) {
            throw new RuntimeException("ID Inválido.");
        }

        System.out.println("ID Válido.\n");

    }
}
