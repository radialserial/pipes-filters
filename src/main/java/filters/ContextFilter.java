package filters;

import entities.Order;

// Contexto que mantém os dados e resultados entre os filtros
public class ContextFilter {

    private boolean authenticated;
    private boolean validated;
    private Order order;

    public ContextFilter() {}

    public ContextFilter(boolean authenticated, boolean validated, Order order) {
        this.authenticated = authenticated;
        this.validated = validated;
        this.order = order;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

