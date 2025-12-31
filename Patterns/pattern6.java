import java.util.*;
class Pattern6 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2;
        for(int i=0; i<=mid; i++){
            for(int j=0; j<=mid-i;j++){
                System.out.print("*");
            }
            for(int j=0; j< 2*i+1; j++){
                System.out.print(" ");
            }
            for(int j=mid-i; j>=0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=mid-1; i>=0; i--){
            for(int j=0; j<=mid-i;j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print(" ");
            }
            for(int j=mid-i; j>=0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}