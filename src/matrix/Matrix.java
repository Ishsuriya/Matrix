
package matrix;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
         int a[][]={{5,4,2},{3,2,1},{2,1,3}};
         int b[][]={{7,5,2},{8,3,1},{2,1,3 }};
         int c[][]=new int[3][3];
          for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               c[i][j]=0;
            for(int k=0;k<3;k++){
              c[i][j]+=a[i][k]*b[k][j];
               }
             System.out.print(c[i][j]+" ");
           }
            System.out.println("\n");
       }
    }
}

           
        
     
    

