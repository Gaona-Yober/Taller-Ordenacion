package ed.u2.sorting;

public final class InsertionSort {

    public static void sort(int[] a) {
        System.out.println("=== Inicio Insertion Sort ===");
        int n = a.length;

        // Bucle externo i = 1..n-1 [cite: 50]
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // Mover elementos mayores que 'key' una posición adelante
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;

            // TRAZA REQUERIDA POR RÚBRICA
            System.out.printf("Iteración %d (Insertando %d): ", i, key);
            SortingUtils.printArray(a);
        }
        System.out.println("=== Fin Insertion Sort ===\n");
    }
}