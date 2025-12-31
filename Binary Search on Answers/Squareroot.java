//Finding the squareroot of a number using LS

/*import java.util.*;

public class Squareroot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose squareroot you want to find: ");
        int num = sc.nextInt();
        int flag = 0, i;
        for(i=0; i*i<= num; i++){
            if(i*i == num){
                System.out.println(i);       //for perfect squares it will print the exact squareroot
                flag=1;
                break;
            }
        }
        //if the square root is not found then the nearest squareroot is returned eg- 50 returns 7 -> 7*7 = 49 one less than 50
        if(flag ==0){
            if(i*i-num>(i-1)*(i-1)-num){
                i--;                              //To some extent this works, but not always gives the closer squareroot
            }
            System.out.println(i);
        }

    }    
}*/

//A better way to do the same thing in the above code using Linear Search is: 

/* 
import java.util.*;

public class Squareroot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose squareroot you want to find: ");
        int num = sc.nextInt();
        int root = 1;
        for(int i=0; i*i<= num; i++){
            if(i*i <= num){
                root = i;
            }
            else{
                break;
            }
        }
        System.out.println(root);

    }    
}

*/

import java.util.*;

public class Squareroot {
    public static int findroot(int n){
        int low = 1, high = n;
        // int ans=1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid <= n){
                //ans = mid;                             //   There is no need of ans variable as high itself will be the ans
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        // return ans;
        return high;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose squareroot you want to find: ");
        int num = sc.nextInt();
        int root = findroot(num);
        System.out.println(root);
        sc.close();

    }    
}