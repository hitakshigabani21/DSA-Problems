import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class LL{
    ListNode head = null;
    ListNode temp = head;
    Scanner sc = new Scanner(System.in);
    public void insert(){
        System.out.println("Enter the value you want to insert: ");
        int val = sc.nextInt();
        ListNode newnode = new ListNode(val);
        if(head == null){
            head = newnode;
            temp = newnode;
        }
        else{
            temp.next = newnode;
            temp = newnode;
        }
    }
    
    public void display(){
        System.out.println("The Linked List is: \n");
        ListNode temp2 = head;
        if(head == null){
            System.out.println("Empty LL!");
            return;
        }
        while(temp2 != null){
            System.out.print(temp2.val + " -> ");
            temp2 = temp2.next;
        }
        System.out.print("X \n");
    }

    public void sort(){
        ListNode head0 = null;
        ListNode head1 = null;
        ListNode head2 = null;
        ListNode temp0 = null;
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode temp = head;
        while(temp != null){
            if(temp.val == 0){
                if(head0 == null){
                    head0 = temp;
                    temp0 = head0;
                }
                else{
                    temp0.next = temp;
                    temp0 = temp0.next;
                }
            }
            else if(temp.val == 1){
                if(head1 == null){
                    head1 = temp;
                    temp1 = head1;
                }
                else{
                    temp1.next = temp;
                    temp1 = temp1.next;
                }
            }
            else if(temp.val == 2){
                if(head2 == null){
                    head2 = temp;
                    temp2 = head2;
                }
                else{
                    temp2.next = temp;
                    temp2 = temp2.next;
                }
            }
            temp = temp.next; 
        }
        if(temp0 != null && temp1 != null){
            temp0.next = head1;
        }
        if(temp1 != null && temp2 != null){
            temp1.next = head2;
            temp2.next = null;
        }
        if(temp1 == null && temp0 !=null && temp2 != null){
            temp0.next = head2;
        }

        //updating head
        if(head0 != null){
            head = head0;
        }
        else if(head1 != null){
            head = head1;
        }
        else{
            head = head2;
        }
        sc.close();
    }

    public void sort2(){
        // Approach-1 to sort using counting
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        ListNode temp = head;
        while(temp != null){
            if(temp.val == 0){
                count0++;
            }else if(temp.val == 1){
                count1++;
            }else{
                count2++;
            }
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(count0 > 0){
                temp.val = 0;
                count0--;
            }else if(count1 >0){
                temp.val = 1;
                count1--;
            }else if(count2>0){
                temp.val = 2;
                count2--;
            }
            temp = temp.next;
        }
    }

    public void sort3(){
        //actual optimal approach
        //creating dummyheadnodes 
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode temp = head;

        while(temp != null){
            if(temp.val == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.val == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        //connecting the three Lists
        zero.next = (oneHead.next != null)? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        head = zeroHead.next;
        //delete the dummy pointers then
    }
}

public class Sort012{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        LL list = new LL();
        while(choice != 4){
            System.out.println("Menu: \n1. Press 1 to insert\n2. Press 2 to display\n3. Press 3 to sort\n4. Press 4 to exit\n");
            choice = sc.nextInt();
            switch(choice){
                case 1: list.insert();
                break;
                case 2: list.display();
                break;
                case 3: list.sort3();
                break;
                case 4: System.out.println("Exiting...");
                break;
                default: System.out.println("Invalid option!!");
            }
        }
        sc.close();
        
    }
}