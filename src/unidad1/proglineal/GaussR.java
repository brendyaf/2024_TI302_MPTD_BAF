
package unidad1.proglineal;

public class GaussR {
    public void simplex(int pivotIndex) {
        int[] arreglo = null;
    if (pivotIndex < 0 || pivotIndex >= arreglo.length) {
        throw new IllegalArgumentException("Índice del pivote fuera de rango.");
    }

    int pivotValue = arreglo[pivotIndex];
    for (int i = 0; i < arreglo.length; i++) {
        if (i != pivotIndex) {
            arreglo[i] = 0; // Ponemos a cero los demás elementos
        } else {
            arreglo[i] = pivotValue; // Mantenemos el pivote
        }
    }
  }
}
