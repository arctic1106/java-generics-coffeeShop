package arcticsoft.coffeeshop;

abstract sealed class CoffeeContainer permits Cup, Bottle {
    private final Coffee cofeeType;

    protected CoffeeContainer(Coffee c) {
        cofeeType = c;
    }

    protected Coffee getCofeeType() {
        return cofeeType;
    }

    protected abstract String getDescription();
}
