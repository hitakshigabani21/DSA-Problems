import java.util.*;

class union {
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
        
        int union [] = new int[n1+n2];
        int i=0,j=0, k=1;
        if(a1[i]<a2[j]){
            union[0] = a1[i];
            i++;
        }
        else{
            union[0] = a2[j];
            j++;
        }
        for(int index=1; index<union.length; index++){
            if(i<a1.length && j<a2.length){
                if(a1[i]<a2[j] && a1[i] != union[k-1]){
                    union[k] = a1[i];
                    i++;
                    k++;
                }
                else if(a1[i] == union[k-1]){
                    i++;
                }
                else if(a2[j] == union[k-1]){
                    j++;
                }
                else if(a1[i] == a2[j]){
                    union[k] = a1[i];
                    k++;
                    i++;
                    j++;
                }
                else if(a2[j]<a1[i] && a2[j] != union[k-1]){
                    union[k] = a2[j];
                    k++;
                    j++;
                }
            }
            else if(i>=a1.length && j<a2.length){
                if(a2[j] != union[k-1]){
                    union[k] = a2[j];
                    j++;
                    k++;
                }
                else{
                    j++;
                }
            }
            else if(i<a1.length && j>=a2.length){
                if(a1[i] != union[k-1]){
                    union[k] = a1[i];
                    k++;
                    i++;
                }
                else{
                    i++;
                }
            }
        }
        for(int id=0; id<k; id++){
            System.out.print(union[id]+" ");
        }
        sc.close();
    }
}

/* Better :
 import java.util.*;

class union {
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
        
        int union [] = new int[n1+n2];
        int i=0,j=0, k=0;
        
        while(i<a1.length && j<a2.length){
            if(a1[i] <= a2[j]){
                if(k==0|| union[k-1] != a1[i]){
                    union[k] = a1[i];
                    k++;
                }
                i++;
            }
            else{
                if(k==0|| union[k-1] != a2[j]){
                    union[k] = a2[j];
                    k++;
                }
                j++;
            }
        }
        
        while(i<a1.length){
            if(k==0|| union[k-1] != a1[i]){
                    union[k] = a1[i];
                    k++;
                }
                i++;
        }
        while(j<a2.length){
            if(k==0|| union[k-1] != a2[j]){
                    union[k] = a2[j];
                    k++;
                }
                j++;
        }
        for(int id=0; id<k; id++){
            System.out.print(union[id]+" ");
        }
    }
}
 */