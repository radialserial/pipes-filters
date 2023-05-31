package pipes;

import filtros.Contexto;
import filtros.Filtro;

import java.util.List;

public class Pipeline {

    private final List<Filtro> filtros;

    public Pipeline(List<Filtro> filtros) {
        this.filtros = filtros;
    }

    public void executarPipeline(Contexto contexto) {
        for (Filtro filtro : filtros) {
            filtro.execute(contexto);
        }
        System.out.println("Filtragem completa.");
    }
}
