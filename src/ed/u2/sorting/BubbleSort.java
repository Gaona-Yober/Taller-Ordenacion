package ed.u2.sorting;

public final class BubbleSort {

    public static void sort(int[] a) {
        System.out.println("=== Inicio Bubble Sort ===");
        int n = a.length;
        boolean swapped; // Bandera para la optimización

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Intercambiar a[j] y a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.print("Pasada " + i + ": ");
            SortingUtils.printArray(a);

            // OPTIMIZACIÓN CORTE TEMPRANO
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) {
                System.out.println("OPTIMIZACIÓN: Corte temprano activado en pasada " + i);
                break;
            }
        }
        System.out.println("=== Fin Bubble Sort ===\n");
    }
}