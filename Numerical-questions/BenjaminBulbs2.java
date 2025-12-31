import java.util.Scanner;

public class BenjaminBulbs2 {
    public static void main(String[] args) {
        System.out.println("Enter number of bulbs: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
        }
        sc.close();
    }
}

