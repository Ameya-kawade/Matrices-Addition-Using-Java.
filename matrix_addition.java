import java.util.Scanner;
public class matrix_addition {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int s,d;
        System.out.println("Enter the no. of rows : ");
        s=sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        d= sc.nextInt();
        if(s!=d) {
            System.out.println("The order of matrices should be Equal for addition\n"+"Please enter the rows and columns again");
            System.out.println("Enter the no. of rows : ");
            s=sc.nextInt();
            System.out.println("Enter the no. of columns : ");
            d= sc.nextInt();
        }

        int[][] matrix1 = new int[s][d];
        int[][] matrix2 = new int[s][d];
        int[][] matrix_sum = new int[s][d];
        System.out.println("Enter the values of matrix 1:");

        for (int i = 0; i < matrix1.length; i++) {
            for (int h = 0; h < matrix1[i].length; h++) {
                matrix1[i][h] = sc.nextInt();
                System.out.print(" ");
            }
            System.out.println("");

        }

        System.out.println("Enter the values of matrix 2:");

        for (int i = 0; i < matrix2.length; i++) {
            for (int h = 0; h < matrix2[i].length; h++) {
                matrix2[i][h] = sc.nextInt();
                System.out.print(" ");
            }
            System.out.println("");

        }


        for (int i = 0; i < matrix_sum.length; i++) {
            for (int h = 0; h < matrix_sum[i].length; h++) {
                matrix_sum[i][h] = matrix1[i][h] + matrix2[i][h];
            }
        }

        System.out.println("The sum matrix is : ");
        for (int i = 0; i < matrix_sum.length; i++) {
            for (int h = 0; h < matrix_sum[i].length; h++) {
                System.out.print(matrix_sum[i][h] + " ");
            }
            System.out.println("");
        }
    }
}
