//insertion in LL : at beginning, at end, at position

import java.util.*;
class LL{
Scanner sc = new Scanner(System.in);
    class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head,tail;
    int size;

    public Node createNode(){
        System.out.println("Node created enter the data: ");
        int data = sc.nextInt();
        Node newnode = new Node(data, null);
        return newnode;
    }

    public void size(){
        Node temp = head;
        int count = 0;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        System.out.println("Size = "+ count);
    }

    public void insertAtEnd(){
        Node newnode = createNode();
        if(head == null){
            head = tail= newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void insertAtBeg(){
        Node newnode = createNode();
        if(head == null){
            head=tail=newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtPos(){
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        int count = 0;
        Node temp = head;
        Node newnode = createNode();
        while(count!=pos){
            count++;
            temp= temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void insertAfterData(){
        System.out.println("Enter the value after which you want to insert a node: ");
        int val = sc.nextInt();
        Node newnode = createNode();
        Node temp = head;
        while(temp.data!= val){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void insertBeforeData(){
        System.out.println("Enter the value before which you want to insert a node: ");
        int val = sc.nextInt();
        Node newnode = createNode();
        Node temp = head;
        //or we cam keep 2 temps for tracking the before value too
        while(temp.next.data!= val){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void display(){
        System.out.println("Linked List: ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;   
        }
        System.out.println("X");
    }

}

public class LLinsert{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        LL list = new LL();
        while(choice != 8){
            System.out.println("Enter your choice: \n1. Insert at end\n2. Insert at beginning\n3. Insert at position\n4. Display\n5. Display size\n6. Insert after a value\n7. Insert before a value\n8. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    list.insertAtEnd();
                    break;
                case 2:
                    list.insertAtBeg();
                    break;
                case 3:
                    list.insertAtPos();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:{
                    list.display();
                    list.size();
                    break;
                }
                case 6: 
                    list.insertAfterData();
                    break;
                case 7:
                    list.insertBeforeData();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}