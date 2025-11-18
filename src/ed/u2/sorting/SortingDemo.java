package ed.u2.sorting;

import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) {
        // Definición de Datasets según la guía [cite: 79-83]
        int[] A = {8, 3, 6, 3, 9};
        int[] B = {5, 4, 3, 2, 1}; // Inverso
        int[] C = {1, 2, 3, 4, 5}; // Ya ordenado
        int[] D = {2, 2, 2, 2};    // Duplicados
        int[] E = {9, 1, 8, 2};

        // Ejecutamos pruebas
        // Nota: Usamos .clone() para no modificar el arreglo original y poder reusarlo

        System.out.println("--- PRUEBA DATASET A (Aleatorio) ---");
        testAll(A);

        System.out.println("--- PRUEBA DATASET B (Inverso) ---");
        testAll(B);

        System.out.println("--- PRUEBA DATASET C (Ordenado - Testea Corte Temprano) ---");
        testAll(C); // Aquí BubbleSort debe mostrar el mensaje de optimización

        System.out.println("--- PRUEBA DATASET D (Duplicados) ---");
        testAll(D);

        System.out.println("--- PRUEBA DATASET E ---");
        testAll(E);
    }

    // metodo auxiliar para probar los tres algoritmos en un mismo dataset
    private static void testAll(int[] original) {
        System.out.println("Original: " + Arrays.toString(original));

        int[] copy1 = original.clone();
        InsertionSort.sort(copy1);

        int[] copy2 = original.clone();
        SelectionSort.sort(copy2);

        int[] copy3 = original.clone();
        BubbleSort.sort(copy3);

        System.out.println("--------------------------------------------------");
    }
}