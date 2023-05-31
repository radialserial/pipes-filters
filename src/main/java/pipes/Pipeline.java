package pipes;

import filtros.Contexto;
import filtros.Filtro;

import java.util.List;

/**
 * Testa vários filtros encadeados contra um contexto.
 */
public class Pipeline {

    private final List<Filtro> filtros;

    public Pipeline(List<Filtro> filtros) {
        this.filtros = filtros;
    }

    /**
     * Executa os filtros um por um em cima do contexto.
     *
     * @param contexto
     *         O contexto contendo o objeto a ser filtrado.
     */
    public void executarPipeline(Contexto contexto) {
        for (Filtro filtro : filtros) {
            filtro.execute(contexto);
        }
        System.out.println("Filtragem completa.");
    }
}
