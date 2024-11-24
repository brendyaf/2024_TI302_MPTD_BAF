
package unidad.asigna;

import java.util.Scanner;

public class LineasOptimasTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca tamaño de la matriz=  ");
        int M = scanner.nextInt();

        double[][] matriz = new double[M][M];
        System.out.println("Introduzca los elementos = ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        LineasOptimas asignacion = new LineasOptimas(matriz);
        asignacion.reducirFilas();
        asignacion.reducirColumnas();
        asignacion.cubrirCerosConLineas();
        int numeroDeLineas = asignacion.obtenerNumeroDeLineas();
        System.out.println(numeroDeLineas);
        System.out.print("R ");
        for (int fila : asignacion.getFilasMarcadas()) {
            System.out.print(fila + " ");
        }
        System.out.println();
        System.out.print("C ");
        for (int columna : asignacion.getColumnasMarcadas()) {
            System.out.print(columna + " ");
        }
        System.out.println();

        scanner.close();
    }
}
