import java.io.*;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of 1st matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter rows and columns of 2nd matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Multiplication not possible.");
            System.exit(0);
        } else {
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r1][c2];
            System.out.println("Enter " + (r1 * c1) + " elements into the matrix a:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter " + (r2 * c2) + " elements into the matrix b:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("The resultant matrix c is:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

