package test;

public class PresenteEquilibrio {

    public static String checkPossibilityToBalance(int[] pesos) {
        for (int peso : pesos) {
            if (peso < 0) {
                throw new IllegalArgumentException("Os pesos não podem ser negativos");
            }
        }

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

    private static int calcularSoma(int[] array) {
        int soma = 0;
        for (int valor : array) {
            soma += valor;
        }
        return soma;
    }
}