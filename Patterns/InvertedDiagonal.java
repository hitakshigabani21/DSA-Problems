// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0; i<n ; i++){
//             for(int j=n; j>=0; j--){
//                 if(i==j){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }

//OR

import java.util.*;
class InvertedDiagonal {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                if(n-i==j){
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