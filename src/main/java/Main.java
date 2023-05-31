import entidades.Bike;
import filtros.*;
import pipes.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Filtro> filtros = new ArrayList<>();

        filtros.add(new FiltroIdValido());
        filtros.add(new FiltroDonoValido());
        filtros.add(new FiltroCorValida());
        filtros.add(new FiltroBikeValida());

        Pipeline pipeline = new Pipeline(filtros);

        Contexto contexto = new Contexto(new Bike(
                "451",
                "Jubileu",
                "Vermelho"
        ));

        pipeline.executarPipeline(contexto);

    }
}
