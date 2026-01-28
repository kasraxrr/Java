import java.util.ArrayList;

public class PizzaOrder {
    private ArrayList<Pizza> pizzas;
    private Customer customer;

    public PizzaOrder(Customer customer) {
        pizzas = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getNumberOfPizzas() {
        return pizzas.size();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public Pizza getPizza(int index) {
        return pizzas.get(index);
    }

    public Pizza getPizza(String pizzaName) {
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i).getName().equals(pizzaName)) {
                return pizzas.get(i);
            }
        }
        return null;
    }

    public double getTotalPrice() {
        double sum = 0;
        if (customer instanceof PrivilegedCustomer) {
            PrivilegedCustomer pc = (PrivilegedCustomer) customer;
            for (int i = 0; i < pizzas.size(); i++) {
                sum += ((1 - pc.getDiscount()) / 100) * (pizzas.get(i).getTotalPrice());
            }
        } else {
            for (int i = 0; i < pizzas.size(); i++) {
                sum += (pizzas.get(i).getTotalPrice());

            }

        }
        return sum;

    }
}
