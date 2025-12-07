package ed.u2.sorting;

public final class SelectionSort {

    public static void sort(int[] a) {
        System.out.println("=== Inicio Selection Sort ===");
        int n = a.length;
        int swapCount = 0; // Contador de swaps requerido

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            // Buscar el mínimo en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }

            // Intercambiar si se encontró un nuevo mínimo
            if (minIdx != i) {
                int temp = a[minIdx];
                a[minIdx] = a[i];
                a[i] = temp;
                swapCount++; // Incrementar contador
            }

            // Imprimimos el estado para ver el progreso
            System.out.print("Pasada " + i + ": ");
            SortingUtils.printArray(a);
        }

        // EVIDENCIA DE SWAPS
        System.out.println("Total de intercambios (swaps): " + swapCount);
        System.out.println("=== Fin Selection Sort ===\n");
    }
}