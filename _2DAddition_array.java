package _concept.Array_StringPractice;
//addition of 2d array>>.
import java.util.Scanner;
public class _2DAddition_array {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array element:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter second array element:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of array element is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
