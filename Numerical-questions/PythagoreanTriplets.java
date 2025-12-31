import java.util.*;

public class PythagoreanTriplets
{
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int hyp, x,y;
		
		if(a>b){
		    if(a>c){
		        hyp = a;
		        x = b;
		        y = c;
		    }
		    else{
		        hyp = c;
		        x = a;
		        y = b;
		    }
		}
		else{
		    if(b>c){
		        hyp = b;
		        x = a;
		        y = c;
		    }
		    else{
		        hyp = c;
		        x = a;
		        y = b;
		    }
		}
		
		if((hyp*hyp) == (x*x)+(y*y)){
		    System.out.println("Pythagorean Triplet");
		}
		else{
		    System.out.println("Not a Pythagorean Triplet");
		}
		sc.close();
		
	}
}

//----
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Enter 3 numbers: ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         int max = a;
//         if (b >= max) {
//             max = b;
//         }
//         if (c >= max) {
//             max = c;
//         }
        
//         boolean flag;
//         if (max == a) {
//             flag = (a * a == b * b + c * c);
//         } else if (max == b) {
//             flag = (b * b == a * a + c * c);
//         } else {
//             flag = (c * c == a * a + b * b);
//         }
        
//         System.out.println("Is Pythagorean triplet? " + flag);
//		   sc.close();
//     }
// }
