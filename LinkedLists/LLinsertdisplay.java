//The most basic LL insertion, display
/*
    1. The class Node is inside main
    2. The constructor is not used to initialize the node
    3. Normal while loop and if else loops are used for implementation instead of switch case
*/

import java.util.*;
class LLinsertdisplay {
    public static class Node{
        int data;
        Node next;
    }
    public static void main(String[] args) {
      int choice = 1;
      Node start = null;
      Scanner sc = new Scanner(System.in);
      while(choice !=3){
        System.out.println("---- MENU---- \n 1. Press 1 for insert\n 2. Press 2 for display\n 3. Press 3 for exit");
        choice = sc.nextInt();
        if(choice == 1){
            Node newnode = new Node();
            System.out.println("Node created-> Enter data: ");
            newnode.data = sc.nextInt();
            newnode.next = null;
            if(start == null){
                start = newnode;
            }
            else{
                Node temp= start;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;
            }
        }
        else if(choice == 2){
            Node temp = start;
            System.out.println("The Linked List is as follows: ");
            while(temp != null){
               System.out.print(temp.data + " -> ");
               temp = temp.next;
            }
            if(temp == null){
                System.out.print("X");
            }
            System.out.println();
        }
        else{
            System.out.println("exiting....");
            break;
        }
      }
    }
}