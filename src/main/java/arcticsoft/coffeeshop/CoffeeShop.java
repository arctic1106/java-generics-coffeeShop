package arcticsoft.coffeeshop;

import arcticsoft.coffeeshop.Cup.CupSize;

import java.util.ArrayList;
import java.util.List;

class CoffeeShop {
    private final List<CoffeeContainer> orders = new ArrayList<>();

    void buyCoffee(String coffeeType, String container, CupSize cupSize) {
        var coffee = Coffee.make(coffeeType);
        var servedCoffee = CoffeeServer.serveCoffee(coffee, container, cupSize);
        orders.add(servedCoffee);
    }

    void buyCoffee(String coffeeType, String container, int milliLiters) {
        var coffee = Coffee.make(coffeeType);
        var servedCoffee = CoffeeServer.serveCoffee(coffee, container, milliLiters);
        orders.add(servedCoffee);
    }

    String listOrders() {
        var sb = new StringBuilder("You have the following items in your shopping cart:\n");
        for (CoffeeContainer item : orders) {
            if (item instanceof Cup<?> c) sb.append("- ").append(c.getDescription());
            else if (item instanceof Bottle<?> b) sb.append("- ").append(b.getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }
}