import java.util.*;
class Envelope {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(n-i)-1; j++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                if(i == n && j == i) continue;
                System.out.print(j);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}