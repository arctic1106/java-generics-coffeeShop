package arcticsoft.coffeeshop;

abstract sealed class CoffeeContainer permits Cup, Bottle {
    private final Coffee cofeeType;

    protected CoffeeContainer(Coffee c) {
        cofeeType = c;
    }

    protected String getDescription() {
        return cofeeType.getDescription();
    }
}