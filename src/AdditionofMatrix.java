import java.util.Scanner;

public class AdditionofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows:");
        int rows = sc.nextInt();

        System.out.println("Enter total columns:");
        int cols = sc.nextInt();

        //2d array:
        int a[][] = new int[rows][cols]; //declare the first matrix
        int b[][] = new int[rows][cols]; //declare the second matrix
        int c[][] = new int[rows][cols]; //declare the sum of the two matrices
        //Initialize the first matrix
        System.out.println("please enter the first matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        //print the first:
        System.out.println("First Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        //Initialize the second matrix
        System.out.println("please enter the second matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }

        }
        System.out.println("");
        //print the second matrix:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");

            //loop to sum the matrices
            //print the sum of the two matrices:
            System.out.println("sum of the matrices");
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < cols; j++) {

                    for (int k = 0; k < cols; k++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            //Print the resultant matrix
            System.out.println("Matrix after addition: ");
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < cols; j++) {
                    System.out.println(c[i][j] + " ");
                }
                System.out.println();
            }
        }
            if ("") {
            System.out.println("Addition is not possible");
            System.out.println("Try again");
        }
    }
}







