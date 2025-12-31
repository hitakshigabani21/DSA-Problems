//Implementation without tail
import java.util.*;


class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
        next = null;
    }
}

class CircleLL{
    Scanner sc = new Scanner(System.in);
    Node start = null;

    public int calcLength(){
        if(start == null){
            return 0;
        }
        else{
            int count = 1;
            Node temp = start;
            while(temp.next!=start){
                temp = temp.next;
                count++;
            }
            if(temp.next == start){
                count++;
            }
            return count;
        }
    }

    public void insertAtBeg(){
        System.out.println("Enter the data you want to insert: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(start == null){
            start = newNode;
            newNode.next = start;
        }//if the below code is written in else then it will not act as expected
        else{
            Node last = start;
            while(last.next != start){
                last = last.next;
            }
            newNode.next = start;
            last.next = newNode;
            start = newNode;
        }
    }

    public void insertAtEnd(){
        System.out.println("Enter the data you want to insert: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(start==null){
            start = newNode;
            newNode.next = start;
        }
        else{
            Node last = start;
            while(last.next != start){
                last = last.next;
            }
            newNode.next = start;
            last.next = newNode;
        }
    }

    public void insertAtPos(){
        System.out.println("Enter the position you want to insert the node: ");
        int index = sc.nextInt();
        System.out.println("Enter the data you want to insert: ");
        int data = sc.nextInt();
        if(index == 0){
            insertAtBeg();
        }
        else if(index == calcLength()){
            insertAtEnd();
        }
        else if(index < 0 || index > calcLength()){
            System.out.println("Invalid Position! ");
        }
        else{
            Node newNode = new Node(data);
            Node temp = start;
            int i=0;
            while(i< index-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtBeg(){
        if(start == null){
            System.out.println("Empty LL!");
        }
        else{
            Node temp = start;
            int val = temp.val;
            while(temp.next != start){
                temp = temp.next;
            }
            temp.next = start.next;
            start = start.next;
            System.out.println("Deleted: "+ val);
        }
    }

    public void deleteAtEnd(){
        if(start == null){
            System.out.println("Empty LL!");
        }
        else{
            Node temp = start;
            while(temp.next.next != start){
                temp = temp.next;
            }
            int val = temp.next.val;
            temp.next = start;
            System.out.println("Deleted: "+ val);
        }
    }

    public void deleteAtPos(){
        System.out.println("Enter the position you want to delete the node: ");
        int index = sc.nextInt();
        if(index == 0){
            deleteAtBeg();
        }
        else if(index == calcLength()){
            deleteAtEnd();
        }
        else if(index < 0 || index > calcLength()){
            System.out.println("Invalid Position! ");
        }
        else{
            Node temp = start;
            int i=0;
            while(i< index-1){
                temp = temp.next;
                i++;
            }
            int val = temp.next.val;
            temp.next = temp.next.next;
            System.out.println("Deleted: "+ val);
        }
    }


    public void display(){

        //can be done using do while loop also
        if(start == null){
            System.out.println("Empty Linked List!");
        }
        else if(start.next == start){
            System.out.println(start.val);  //when only one node is there 
        }
        else{
            Node temp = start;
            while(temp.next!= start){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print(temp.val+ " -> "+ temp.next.val+"\n");

        }
    }
}


public class CircularLL {
    public static void main(String args[]){
        CircleLL list = new CircleLL();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=8){
            System.out.println("Choose a valid option: ");
            System.out.println("---- MENU ----\n1. Insert at Beginning\n2. Insert at End\n3. Insert at Position\n4. Delete at Beginning\n5. Delete at End\n6. Delete at Position\n7. Display\n8. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: list.insertAtBeg();
                break;
                case 2: list.insertAtEnd();
                break;
                case 3: list.insertAtPos();
                break;
                case 4: list.deleteAtBeg();
                break;
                case 5: list.deleteAtEnd();
                break;
                case 6: list.deleteAtPos();
                break;
                case 7: list.display();
                break;
                case 8: System.out.println("Exiting ...");
                break;
                default: System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
