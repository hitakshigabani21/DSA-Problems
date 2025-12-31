import java.util.*;
class NumberDiamond1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2, m=1;
        for(int i=0; i<=mid; i++){
            m = i+1;
            for(int j=mid-i; j>=0; j--){
                System.out.print(" ");
            }
           for(int j=0; j<=((2*i)+1)/2; j++){
               System.out.print(m);
               m++;
           }
           m = m-1;
           for(int j=((2*i)+1)/2; j>0; j--){
               m--;
               System.out.print(m);
           }
           System.out.print("\n");
        }
        m = 1;
        for(int i=mid-1; i>=0; i--){
            m = i+1;
            for(int j=mid-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=((2*i)+1)/2; j++){
               System.out.print(m);
               m++;
           }
           m = m-1;
           for(int j=((2*i)+1)/2; j>0; j--){
               m--;
               System.out.print(m);
           }
           System.out.print("\n");
        }
        sc.close();
    }
}