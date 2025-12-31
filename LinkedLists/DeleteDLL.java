import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
    ListNode(int val, ListNode next, ListNode prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class DLL{
    ListNode head = null;
    ListNode temp = null;

    Scanner sc = new Scanner(System.in);

    public void insert(){
        System.out.println("Enter the value you want to insert: ");
        int val = sc.nextInt();
        ListNode newnode = new ListNode(val);
        if(head == null){
            head = newnode;
            temp = head;
        }else{
            temp.next = newnode;
            newnode.prev = temp;
            temp = newnode;
        }
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
        System.out.print("X\n");
    }

    public void deleteAll(int value){
        ListNode temp = head;
        if(temp.val == value){
            temp.next.prev = null;
            head = temp.next;
            temp = temp.next;
        }
        while(temp.next!= null){
            if(temp.val == value){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
        if(temp.val == value){
            temp.prev.next = null;
        }
    }

    public void deleteAll2(int value){
        //Better way - No need to handle first and last node seperately
        ListNode temp = head;
        while(temp != null){
            if(temp.val == value){
                if(temp == head){
                    head = temp.next;
                }
                ListNode prevNode = temp.prev;
                ListNode nextNode = temp.next;
                if(prevNode != null){
                    prevNode.next = nextNode;
                }else if(nextNode !=null){
                    nextNode.prev = prevNode;
                }
                //In c++ - free(temp)
                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
    }
}
public class DeleteDLL {
    public static void main(String args[]){
        DLL dl = new DLL();
        int choice = 0;
        while(choice != 4){
            System.out.println("1. Insert\n2. Display\n3. Delete All Occurrences\n4. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    dl.insert();
                    break;
                case 2:
                    dl.display();
                    break;
                case 3:
                    System.out.println("Enter the value to delete all occurrences: ");
                    int val = sc.nextInt();
                    dl.deleteAll2(val);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again."); 
            }
        }
    }
}
