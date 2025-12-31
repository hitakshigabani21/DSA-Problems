import java.util.*;
class PascalTriangle{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int icjp1;
        for(int i=0; i<n; i++){
            int icj = 1;
            for(int j=0; j<=i; j++){
                System.out.print(icj + " ");
                icjp1 = icj * (i-j)/ (1+j);
                icj = icjp1;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}