import java.util.*;

public class NRoot {
    public static int findNRoot(int n, int root){
        int low = 1, high = n;
        // int ans=1;
        int flag=0;
        while(low<=high){
            int mid = (low+high)/2;
            int r=1, i=1;
            while(i<=root){
                r*=mid;
                i++;
            }
            if(r <= n){
                if(r==n){                             //only if the nth root exists, then only update and return the answer eg- 4th root of 69 does not exist.
                    flag=1;
                   // ans = mid;      //not needed as high itself is the answer
                }                       
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(flag == 0){
            return -1;
        }
        else{
            return high;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose squareroot you want to find: ");
        int num = sc.nextInt();
        System.out.println("Enter the root: ");
        int r = sc.nextInt();
        int root = findNRoot(num, r);
        System.out.println(root);
        sc.close();

    }    
}
