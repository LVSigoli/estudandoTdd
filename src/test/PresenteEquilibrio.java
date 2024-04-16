package test;

public class PresenteEquilibrio {

    public static String verificarPossibilidade(int[] pesos) {


        int somaA = 0;
        int somaB = 0;

        for (int peso : pesos) {
            if (Math.abs(somaA - somaB) > 5) {
                return "N";
            }

            if (somaA <= somaB) {
                somaA += peso;
            } else {
                somaB += peso;
            }
        }

        return "S";
    }
}