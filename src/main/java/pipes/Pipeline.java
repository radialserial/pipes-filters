package pipes;

import filters.Filtro;
import filters.FiltroContexto;

import java.util.List;

public class Pipeline {

    private final List<Filtro> filtros;

    public Pipeline(List<Filtro> filtros) {
        this.filtros = filtros;
    }

    public void executarPipeline(FiltroContexto contexto) {
        for (Filtro filtro : filtros) {
            filtro.execute(contexto);
        }
    }
}
