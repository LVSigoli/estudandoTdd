package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PresenteEquilibrioTest {

    @Test
    public void ShouldBalanceAll() {
        int[] pesos = {3, 4, 2};
        assertEquals("S", PresenteEquilibrio.checkPossibilityToBalance(pesos));
    }

    @Test
    public void BalanceisImpossible() {
        int[] pesos = {6, 6};
        assertEquals("N", PresenteEquilibrio.checkPossibilityToBalance(pesos));
    }

    @Test
    public void WeightisEqualtoZero() {
        int[] pesos = {};
        assertEquals("S", PresenteEquilibrio.checkPossibilityToBalance(pesos));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWeights() {
        int[] pesos = {-3, 4, 2};
        PresenteEquilibrio.checkPossibilityToBalance(pesos);
    }

}
