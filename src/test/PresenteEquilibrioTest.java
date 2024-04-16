package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PresenteEquilibrioTest {

    @Test
    public void ShouldBalanceAll() {
        int[] pesos = {3, 4, 2};
        assertEquals("S", PresenteEquilibrio.verificarPossibilidade(pesos));
    }

    @Test
    public void testEquilibrioImpossivel() {
        int[] pesos = {6, 6};
        assertEquals("N", PresenteEquilibrio.verificarPossibilidade(pesos));
    }
}
}