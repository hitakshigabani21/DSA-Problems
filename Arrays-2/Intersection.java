import java.util.*;

class Intersection {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array-1: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n1; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in array-2: ");
        int n2 = sc.nextInt();
        int a2 []= new int[n2];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        
        int intersection [] = new int[n1<n2? n1:n2];
        int i=0, j=0, k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i] == a2[j]){
                intersection[k] = a1[i];
                j++;
                k++;
            }
            i++;
        }
        for(int id=0; id<k; id++){
            System.out.print(intersection[id]+" ");
        }
        sc.close();
    }
}
