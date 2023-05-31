import entities.Pedido;
import filters.*;
import pipes.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Filtro> filtros = new ArrayList<>();
        filtros.add(new FiltroAutenticacao());
        filtros.add(new FiltroValidacao());
        filtros.add(new FiltroProcesso());

        Pipeline pipeline = new Pipeline(filtros);

        FiltroContexto contexto = new FiltroContexto();
        contexto.setContexto(new Pedido(
                "test_id",
                "mock_buyer",
                "mock_product"
        ));

        pipeline.executarPipeline(contexto);
    }
}
