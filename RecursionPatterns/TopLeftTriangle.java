import java.util.*;

public class TopLeftTriangle {
    static void printTriangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col == row){
           System.out.println();
           printTriangle(row-1, 0);
           return;
        }
        System.out.print("* ");
        printTriangle(row, col+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printTriangle(n, 0);
        sc.close();
    }
}
