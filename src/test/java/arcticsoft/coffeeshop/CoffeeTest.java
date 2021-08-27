package arcticsoft.coffeeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeTest {
    @Test
    void coffeeMakeTest() {
        assertEquals(Coffee1.class, Coffee1.make("Coffee1").getClass());
        assertEquals(Coffee2.class, Coffee1.make("Coffee2").getClass());
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Coffee1, which is GROUND_BEAN LIGHT", Coffee.make("Coffee1").getDescription());
        assertEquals("Coffee2, which is WHOLE_BEAN DARK", Coffee.make("Coffee2").getDescription());
    }
}