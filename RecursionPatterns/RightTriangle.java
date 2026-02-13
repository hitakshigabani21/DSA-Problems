import java.util.Scanner;

public class RightTriangle {
    static void printTriangle(int n, int row, int col){
        if(row == n){
            return;
        }
        if(col == row+1){
           System.out.println();
           printTriangle(n, row+1, 0);
           return;
        }
        System.out.print("* ");
        printTriangle(n, row, col+1);
    }
// here just change the order of recursive calls to print the triangle normal 
    static void printTriangle2(int row, int col){
        if(row == 0){
            return;
        }

        if(col<row){
            printTriangle2(row, col+1);
            System.out.print("* ");
        } else {
            printTriangle2(row-1, 0);
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printTriangle2(n, 0);
        sc.close();
    }
}
