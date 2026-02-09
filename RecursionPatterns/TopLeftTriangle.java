import java.util.*;

public class TopLeftTriangle {
    static void printTriangle(int n, int row, int col){
        if(row == n){
            return;
        }
        if(col == n-row){
           System.out.println();
           printTriangle(n, row+1, 0);
           return;
        }
        System.out.print("* ");
        printTriangle(n, row, col+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printTriangle(n, 0, 0);

    }
}
