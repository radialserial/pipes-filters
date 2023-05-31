package entidades;

public class Bike {
    private final String id;
    private final String dono;
    private final String cor;

    public Bike(String id, String dono, String cor) {
        this.id = id;
        this.dono = dono;
        this.cor = cor;
    }

    public String id() {
        return this.id;
    }

    public String dono() {
        return this.dono;
    }

    public String cor() {
        return this.cor;
    }
}
