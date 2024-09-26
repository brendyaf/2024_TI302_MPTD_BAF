
package unidad1.proglineal;

public class SimplexTest {
    public static void main(String[] args) {
         
         int[] arr = {1,-3,-6,9,0,1,-2};
         int[] arr2 ={1,2,3};
          Simplex no = new Simplex(arr);
          no.simplex(1);
          System.out.println("Simplex"+ no);
     }
}
