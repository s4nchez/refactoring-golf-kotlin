package a;

import org.junit.Test;

import static a.Money.money;
import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canSumABunchOfAmounts() throws Exception {
        assertEquals(Calculator.add(money(4, "GBP"), money(5, "GBP"), money(6, "GBP")).value, 15);
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        Calculator.add(money(4, "GBP"), money(5, "USD"));
    }
}