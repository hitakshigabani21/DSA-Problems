import java.util.*;
class Table {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+ " * "+ i +" = "+ (n*i));
        }
        sc.close();
    }
}