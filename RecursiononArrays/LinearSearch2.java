//returning all the indexes

import java.util.*;

public class LinearSearch2 {
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int i, int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            list.add(i);
        }

        findAllIndex(arr, i+1, key);
    }

    static ArrayList<Integer> findAllIndex2(int arr[], int i, int key, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == key){
            list.add(i);
        }

        return findAllIndex2(arr, i+1, key, list);
    }

    static ArrayList<Integer> findAllIndex3(int arr[], int i, int key){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == key){
            list.add(i);
        }
        ArrayList<Integer> list2 = findAllIndex3(arr, i+1, key); //We cannot directly pass list2 like : list.addAll(findAllIndex3(arr, i+1, key)) because the list2 is not yet created at the time of calling the function. So we have to first store the returned list in a variable and then add it to our main list.
        list.addAll(list2);  //We also cannot directly return list.addAll(list2) because the return type of addAll is boolean and not ArrayList. So we have to first add the list2 to our main list and then return the main list.
        return list;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();


        //approach-1: using a static global list which is accessible from everywhere
        findAllIndex(arr, 0, key);
        System.out.println("The element is present at the following indexes: "+ list);

        //approach-2: passing the list as a parameter in the function and returning it (optimised and recommended approach)
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("The element is present at the following indexes: "+ findAllIndex2(arr, 0, key, list2));

        //approach-3: without passing the list as a parameter in the function and returning it (not recommended approach)
        System.out.println("The element is present at the following indexes: "+ findAllIndex3(arr, 0, key));
    }
}
