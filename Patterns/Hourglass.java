import java.util.*;
class Hourglass {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2;
        for(int i=mid; i>=0;i--){
            for(int j=0; j<mid-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j==0||j==2*i){
                    System.out.print("*");
                }
                else if(i==mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i=1; i<=mid; i++){
            for(int j=0; j<mid-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}