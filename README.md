# Taller 5: Algoritmos de Ordenación en Java

**Asignatura:** Estructura de Datos  
**Unidad:** 2 - Ordenación y Búsqueda  
**Autores:** Yober Gaona, Mateo Silva.   
**Fecha:** Lunes 17 Noviembre 2025

---

## 1. Descripción del Proyecto
Este proyecto implementa y compara tres algoritmos de ordenación *in-place* (Burbuja, Selección e Inserción) utilizando Java. El objetivo es validar su funcionamiento mediante trazas, conteo de operaciones y pruebas con casos borde, siguiendo el enfoque metodológico de la guía práctica Nro. 005.

## 2. Decisiones de Implementación
Para cumplir con los requisitos de la rúbrica, se tomaron las siguientes decisiones de diseño en el paquete `ed.u2.sorting`:

* **InsertionSort (Inserción):** * Se implementó la impresión de una **traza detallada** en cada iteración del bucle externo. Esto permite visualizar cómo el elemento "pivote" se inserta en la sublista ordenada, facilitando la validación manual del algoritmo.
* **SelectionSort (Selección):** * Se añadió un contador de **intercambios (swaps)**. Dado que la propiedad principal de este algoritmo es minimizar las escrituras en memoria (hace a lo sumo $N$ intercambios), este contador sirve como evidencia de su comportamiento frente a otros métodos.
* **BubbleSort (Burbuja):** * Se implementó la optimización de **corte temprano**. Si en una pasada completa no se registran intercambios, el algoritmo detecta que el arreglo ya está ordenado y termina prematuramente, mejorando el rendimiento en casos como el Dataset C (ya ordenado).

## 3. Casos Borde y Datasets Probados
Se han verificado los algoritmos utilizando los siguientes datasets estandarizados en la clase `SortingDemo`:

* **Dataset A (Aleatorio):** `[8, 3, 6, 3, 9]` - Caso promedio.
* **Dataset B (Orden Inverso):** `[5, 4, 3, 2, 1]` - El peor caso para algoritmos como Inserción y Burbuja (máximo número de comparaciones/movimientos).
* **Dataset C (Ya Ordenado):** `[1, 2, 3, 4, 5]` - Caso borde para verificar la optimización del **Corte Temprano** en Burbuja y la eficiencia de Inserción.
* **Dataset D (Duplicados):** `[2, 2, 2, 2]` - Verifica que los algoritmos no realicen intercambios innecesarios o ciclos infinitos con valores idénticos.
* **Dataset E:** `[9, 1, 8, 2]` - Caso pequeño adicional de prueba.

## 4. Cómo Ejecutar el Proyecto

### Requisitos
* **JDK:** Versión 17 o superior.
* **IDE:** IntelliJ IDEA.

### Pasos
1.  Abrir el proyecto en el IDE.
2.  Navegar a la ruta: `src/ed/u2/sorting/`.
3.  Abrir el archivo **`SortingDemo.java`**.
4.  Ejecutar el método `main`.
5.  Verificar la salida en la consola, la cual mostrará:
    * El arreglo original.
    * Las trazas paso a paso (para Inserción).
    * El conteo de swaps (para Selección).
    * Mensajes de optimización (para Burbuja).

---

## 5. Comparación Cualitativa (Resumen)
Basado en la ejecución:
* **Inserción** resultó ser el más eficiente para el arreglo ya ordenado (Dataset C) y datos pequeños, debido a su baja sobrecarga.
* **Selección** realizó consistentemente el menor número de intercambios físicos, independientemente del desorden inicial.
* **Burbuja** es generalmente el menos eficiente, pero su optimización de corte temprano funcionó correctamente detectando el Dataset C en la primera pasada.
