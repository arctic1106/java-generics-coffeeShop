package arcticsoft.coffeeshop;

public final class Cup<T extends Coffee> extends CoffeeContainer {
    private final CupSize cupSize;

    Cup(T coffee, CupSize cupSize) {
        super(coffee);
        this.cupSize = cupSize;
    }

    protected String getDescription() {
        return cupSize + " cup of " + super.getDescription();
    }

    enum CupSize {SMALL, MEDIUM, BIG}
}