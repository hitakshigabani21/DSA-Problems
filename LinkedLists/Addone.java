import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class LL{
    Scanner sc = new Scanner(System.in);
    ListNode head=null;
    ListNode temp = head;
    public void insert(){
        System.out.println("Enter the value you want to insert: ");
        int val = sc.nextInt();
        ListNode newnode = new ListNode(val);
        if(head == null){
            head = newnode;
            temp = head;
        }
        else{
            temp.next = newnode;
            temp = temp.next;
        }
    }
    
    public void display(){
        if(head == null){
            System.out.println("Empty LL!");
        }
        ListNode temp1 = head;
        while(temp1!=null){
            System.out.print(temp1.val+" -> ");
            temp1 = temp1.next;
        }
        System.out.print("X\n");
    }
    
    public void insertAtBeg(ListNode node){
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    public ListNode reverseLL(ListNode head){
        this.head = head;
        if(head == null ||head.next == null){
            return head;
        }
        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    
    public void addOne(){
        int sum = 0;
        ListNode temp2 = head;
        while(temp2 != null){
            sum = sum*10+ temp2.val;
            temp2 = temp2.next;
        }
        
        sum = sum + 1;
        head = null;
        while(sum > 0){
            int val = sum%10;
            ListNode newnode = new ListNode(val);
            insertAtBeg(newnode);
            sum = sum/10;
        }
    }

    public ListNode add1(){
        //better approach
        ListNode revHead = reverseLL(head);
        int carry = 1;
        ListNode temp = revHead;
        while(temp != null){
            temp.val = temp.val + carry;
            if(temp.val < 10){
                carry = 0;
                break;
            }
            else{
                temp.val = 0; //since we are adding 1 it cannot be beyond 10 i.e. 11,12,etc.
                carry = 1;
            }
            temp = temp.next;
        }
        revHead = reverseLL(revHead);
        if(carry == 1){
            ListNode newnode = new ListNode(1);
            newnode.next = revHead;
            this.head = newnode;
            return newnode;
        }
        this.head = revHead;
        return revHead;
    }
   
}
class Addone{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int choice = 0;
        while(choice != 5){
            System.out.println("MENU ---\n1. Press 1 for insert\n2. Press 2 to display\n3. Press 3 to add one\n4. Press 4 to add 1\n5. Press 5 to exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: list.insert();
                break;
                case 2: list.display();
                break;
                case 3: list.addOne();
                break;
                case 4: list.add1();
                break;
                case 5: System.out.println("exititng...\n");
                break;
                default: System.out.println("Invalid option");
            }
        }
    } 
}


//Brute force approach: 1. Converted LL to number 2. Added one to the number 3. Converted number to a new LL by freshly creating new nodes
//Time Complexity: O(n) + O(n) - for traversing and converting in to number and then for each digit creating new node and insert at beg which is O(1) complexity for inserting
//Space complexity : O(n) new LL

//Another approach: 
//Time complexity : O(n)+O(2n) : traversing and reversing twice

