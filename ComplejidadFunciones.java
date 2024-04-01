public class ComplejidadFunciones {
    public static void main(String[] args) {
        int n = 10; // Puedes cambiar este valor para probar con diferentes valores de n

        // Ecuación a: f(n) = 2n^3 - 3n^2 + 1 es O(n^3)
        long startTimeA = System.nanoTime();
        long resultadoA = 2 * (long) Math.pow(n, 3) - 3 * (long) Math.pow(n, 2) + 1;
        long endTimeA = System.nanoTime();
        System.out.println("Ecuación a: f(n) = " + resultadoA + ", Tiempo de ejecución: " + (endTimeA - startTimeA) + " ns");

        // Ecuación b: f(n) = 5n + 4n^2 - sqrt(n) + 1 es O(n^2)
        long startTimeB = System.nanoTime();
        long resultadoB = 5 * n + 4 * (long) Math.pow(n, 2) - (long) Math.sqrt(n) + 1;
        long endTimeB = System.nanoTime();
        System.out.println("Ecuación b: f(n) = " + resultadoB + ", Tiempo de ejecución: " + (endTimeB - startTimeB) + " ns");

        // Ecuación c: f(n) = 2 log n + 24n + sqrt(2n) es O(n)
        long startTimeC = System.nanoTime();
        long resultadoC = 2 * (long) (Math.log(n) / Math.log(2)) + 24 * n + (long) Math.sqrt(2 * n);
        long endTimeC = System.nanoTime();
        System.out.println("Ecuación c: f(n) = " + resultadoC + ", Tiempo de ejecución: " + (endTimeC - startTimeC) + " ns");
    }
}
