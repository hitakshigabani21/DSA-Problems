import java.util.*;
class Cross {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n; j++){
                if(i==j || n-i+1 == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}