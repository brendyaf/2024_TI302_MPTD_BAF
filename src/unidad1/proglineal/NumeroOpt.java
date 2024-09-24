/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 MPTD
 FRANCISCO JAVIER MONTECILLO PUENTE
 BRANDY AGUILAR FLORES
 DESCRIPCIÓN: TAREA 1
 11/09/2024
*/
package unidad1.proglineal;


public class NumeroOpt {
    private int [] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    
    public int calcular(){
        int min= arreglo[0];
        int index = 0;
        
        // orden N pq es solo un for
        for (int i = 1; i < arreglo.length; i++) {
            if ( arreglo[i] < min){
                index = i;
                min = arreglo[i];
            }
        }
        return min >= 0 ? -1: index;
    }
}
