package _concept.Array_StringPractice;
//Multiplication of 2d array>>.
import java.util.Scanner;
public class _2dMultiplicationArray {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first array element:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter a second array element:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Multiplication of array element is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                {
                    for( i=0;i<3;i++){
                        for(j=0;j<3;j++){
                          for( int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
      }
     }
    }
 }
}
    