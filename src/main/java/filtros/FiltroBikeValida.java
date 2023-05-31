package filtros;

/**
 * Executa a filtragem final da bike levando em conta todos os dados do contexto.
 */
public class FiltroBikeValida implements Filtro {

    @Override
    public void execute(Contexto contexto) {

        System.out.println("Checando validade da bike...\n");

        if (contexto.corValida() && contexto.donoValido() && contexto.idValido()) {
            System.out.println("Bike completamente válida.");
            return;
        }

        // Caso a bike tenha algum elemento inválido, ele será examinado aqui
        if (!contexto.idValido()) System.out.println("ID da bike é inválido.");
        if (!contexto.donoValido()) System.out.println("Bike não tem dono.");
        if (!contexto.corValida()) System.out.println("Cor da bike não está disponível.");


    }


}
