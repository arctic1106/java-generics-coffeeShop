package arcticsoft.coffeeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeContainerTest {
    @Test
    void getContent() {
        var bottle = new Bottle<>(Coffee.make("Coffee1"), 333);
        assertEquals(Coffee1.class, bottle.getCofeeType().getClass());
        assertEquals("Bottle of 333 milliLiters of Coffee1, which is GROUND_BEAN LIGHT", bottle.getDescription());
        var cup = new Cup<>(Coffee.make("Coffee2"), Cup.CupSize.MEDIUM);
        assertEquals(Cup.class, cup.getClass());
        assertEquals("MEDIUM cup of Coffee2, which is WHOLE_BEAN DARK", cup.getDescription());
    }
}