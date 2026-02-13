public class Reverse {
    //Approach-2 : Basic
    static int sum =0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        sum = sum*10 + n%10;
        reverse(n/10);
    }
    //Approach 3: Same as approach1 but here we are using a helper function to actually calculate the reverse and not initially calculating the digits in the main function but in the rev2 function

    static int rev2(int n){
        int digits = (int)(Math.log10(n)+1); //formula to calculate the digits in a number
        return helper(n, digits);
    }

    static int helper(int n , int digits){
        if(n%10 == n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10, digits-1))+ helper(n/10, digits-1);
    }
    public static void main(String args[]){
        int n = 123;
        reverse(n);
        System.out.println(sum);

        int n2 = 1234;
        System.out.println(rev2(n2)); 
       
    }
}

//Here the sum is a global variable
//So, in the reverse function the syum is getting updated as before in iterative approach: take the last digit shift the previous sum to one place value ahed and add the last digit to it
//until n != 0
//When we call the rev function the value of global variable sum is changed 
//Then we can access it in the main because it is global can be accessed from anywhere

//Whenever we require some other variable we can make a use of a helper function
//In the rev2 we are calculating the digits for just once initially and calling the function that actually calculates the reverse and returns back the value to rev2 function which then returns the same value to the main function
//Because the helper function takes exact number of digits but we need  digit -1 so we do digits-1 in pow() function and then the power keeps on getting reduced by 1

