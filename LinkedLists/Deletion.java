import java.util.*;
class LL{
    Scanner sc = new Scanner(System.in);
    class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data = data;
        }
    }

    Node start = null;

    public Node createNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    public void insert(){
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        Node newnode = createNode(data);
        if(start == null){
            start = newnode;
        }
        else{
            Node temp=start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void deleteAtBeg(){
        if(start == null){
            System.out.println("Linked List is empty!");
        }
        else{
            start = start.next;
        }
    }

    public void deleteAtEnd(){
        if(start == null){
            System.out.println("Empty LL!");
        }
        else if(start.next == null){
            start = null;
        }
        else{
            Node temp = start;
            while(temp.next.next!= null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteAtPos(){
        System.out.println("Enter the positon to delete: ");
        int pos = sc.nextInt();
        int count=1;
        Node temp1 = start;
        Node temp2 = start.next;
        while(count != pos-1){      //becausetemp2 should be at pos not temp1
            temp1 = temp1.next;
            temp2 = temp2.next;
            count++;
        }
        temp1.next = temp2.next;
        temp2 = null;

    }

    public void search(){
        if(start == null){
            System.out.println("Empty!");
        }
        else{
            System.out.println("LL :");
            display();
            System.out.println("Enter the element to search: ");
            int value = sc.nextInt();
            Node temp = start;
            int count = 0;
            while(temp != null){   // check first
                if(temp.data == value){   // found
                System.out.println("Found at position: " + count);
                }
                temp = temp.next;
                count++;
            }
            System.out.println("Not found!");
        }
        
    }

    public void display(){
        if(start == null){
            System.out.println("Empty!");
        }
        else{
            Node temp = start;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("X");
        }
    }
}

public class Deletion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        LL list = new LL();
        while(choice != 6){
            System.out.println("1. Insert\n2. Delete at Beginning\n3. Delete at End\n4. Delete at Position\n5. Display\n6. Exit\n7. Search1");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    list.insert();
                    break;
                case 2:
                    list.deleteAtBeg();
                    break;
                case 3:
                    list.deleteAtEnd();
                    break;
                case 4:
                    list.deleteAtPos();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                case 7:
                    list.search();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}