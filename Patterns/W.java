import java.util.*;
class W {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || j==n){
                    System.out.print("* ");
                }
                else if(i>mid+1 && j == n-i+1){
                    System.out.print("* ");
                }
                else if(i==j && i> mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}