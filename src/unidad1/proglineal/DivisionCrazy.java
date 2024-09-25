/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 MPTD
 FRANCISCO JAVIER MONTECILLO PUENTE
 BRANDY AGUILAR FLORES
 
 19/09/2024
 DESCRIPCION: 
 Entrada
 Arreglo de números separados por un espacio, por ejemplo: 
1	1
2	0
0	-6
1	8
-3 	 -4
Salida
Valor entero del índice (comenzando en cero, 0-indexing): 0  
Observaciones
Números enteros, positivos, negativos ceros.
Tener cuidado con las divisiones entre cero.
En caso de no haber número que cumpla con el criterio dar como salida -1

*/
package unidad1.proglineal;

public class DivisionCrazy {
    private double columna1[];
    private double columna2[];
    private double division[];

    public DivisionCrazy(double[] columna1, double[] columna2, double[] division) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        
        this.division = new double [columna1.length];
    }

    DivisionCrazy(double[] columna1, double[] columna2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int  resolver(){
        for (int i = 1; i < columna1.length; i++) {
            division[i] = columna2[i] / columna1[i];
                    
        }
        return 0;
    }
    
    public void print(){
        for (int i = 0; i < division.length; i++) {
            System.out.println("div" + i + ": " + division[i]);
        }
    }

    @Override
    public String toString() {
        return "DivisionCrazy{" + "columna1=" + columna1 + ", columna2=" + columna2 + ", division=" + division + '}';
    }
    
    

    
}
