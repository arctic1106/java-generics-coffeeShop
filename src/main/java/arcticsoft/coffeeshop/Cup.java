package arcticsoft.coffeeshop;

public final class Cup<T extends Coffee> extends CoffeeContainer {
    private final CupSize cupSize;

    Cup(T coffee, CupSize cupSize) {
        super(coffee);
        this.cupSize = cupSize;
    }

    @Override
    protected String getDescription() {
        return cupSize + " cup of " + getCofeeType().getDescription();
    }

    enum CupSize {SMALL, MEDIUM, BIG}
}