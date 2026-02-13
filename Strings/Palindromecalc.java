//using String builder reverse() method
// import java.util.*;
// public class Palindromecalc {
//     public static void main(String args[]){
//         System.out.println("Enter a string: ");
//         Scanner sc = new Scanner(System.in);
//         StringBuilder builder = new StringBuilder(sc.next());
//         String org = builder.toString(); 
//         String reverse = (builder.reverse()).toString();
//         if(reverse.equals(org)){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
// }

//Using char array
// import java.util.*;
// public class Palindromecalc {
//     public static void main(String args[]){
//         System.out.println("Enter a string: ");
//         Scanner sc = new Scanner(System.in);
//         String strs = sc.next();
//         strs = strs.toLowerCase();   //casing should be ignored
//         char str[] = strs.toCharArray();
//         int flag = 0;
//         for(int i =0; i<str.length/2; i++){
//             if(str[i]!= str[str.length-1-i]){
//                 System.out.println("False");
//                 flag = 1;
//                 break;
//             }
//         }
//         if(flag != 1){
//             System.out.println("True");
//         }
//     }
// }

//Without char array
import java.util.*;
public class Palindromecalc {
    public static void main(String args[]){
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();   //casing should be ignored
        int flag=0;
        if(str == null || str.length() == 0){
            System.out.println("true");
        }
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("False");
                flag = 1;
                break;
            }
        }
        if(flag != 1){
            System.out.println("True");
        }
        sc.close();
    }
}

