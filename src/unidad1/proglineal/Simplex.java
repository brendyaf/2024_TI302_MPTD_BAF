
package unidad1.proglineal;

public class Simplex {
    
    private int[] arreg;

    public Simplex(int[] arregl) {
        this.arreg = arregl;
    }

    public void setArreglo(int[] arregl) {
        this.arreg = arregl;
    }

    public int Calcular() {
        int min = arreg[0];
        int index = 0;

        for (int i = 0; i < arreg.length; i++) {
            if (arreg[i] < min) {
                index = i;
                min = arreg[i];
            }
        }
        return min >= 0 ? -1 : index;
    }

    public void simplex(int pivotIndex) {
        if (pivotIndex < 0 || pivotIndex >= arreg.length) {
            throw new IllegalArgumentException("Índice del pivote fuera de rango.");
        }  }
}
