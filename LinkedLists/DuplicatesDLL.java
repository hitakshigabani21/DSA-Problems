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

    public void removeduplicates(){
        //approach-1 O(n)
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val == temp.next.val){
                if(temp == head){
                    temp.next.prev = null;
                    head = temp.next;
                }else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
    }

    public void removeduplicates2(){
        //other approach- O(n) 
        //outer loop - skips duplicates 
        //inner loop - traverses the duplicates. So, overall it is O(n) not n^2
        ListNode temp = head;
        ListNode nextNode = head.next;
        while(temp!= null && temp.next!=null){
            nextNode = temp.next; //after stopping for once to continue again this is added
            while(nextNode!=null && nextNode.val == temp.val){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode!=null){
                nextNode.prev = temp;
            }
            temp = temp.next;
        }
    }

}
public class DuplicatesDLL{
    public static void main(String args[]){
        DLL dl = new DLL();
        int choice = 0;
        while(choice != 4){
            System.out.println("1. Insert\n2. Display\n3. Remove Duplicates\n4. Exit");
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
                    dl.removeduplicates();
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


