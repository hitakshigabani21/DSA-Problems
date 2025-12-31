import java.util.*;
class Arrow {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int mid = n/2;
        for(int i=0; i<=mid; i++){
            for(int j=0; j<mid; j++){
                if(i == mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=mid; j>=mid-i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=mid-1; i>=0;i--){
            for(int j=0; j<mid; j++){
                if(i == mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=mid; j>=mid-i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}