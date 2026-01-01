import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode child;
    ListNode(int val){
        this.val = val;
        this.child = null;
        this.next = null;
    }
}

class LL{
    ListNode head = null;
    ListNode temp = head;
    
    public ListNode createList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to insert: ");
        int val = sc.nextInt();
        ListNode newHead = new ListNode(val);
        ListNode temp1= newHead;
        int choice = 0;
        while(choice != 1){
            System.out.println("Do you want to continue adding nodes in this list? Press 1 to add next list. Press 0 to continue");
            choice = sc.nextInt();
            if(choice == 0){
                System.out.println("Enter the value you want to insert: ");
                val = sc.nextInt();
                ListNode newNode = new ListNode(val);
                temp1.child = newNode;
                temp1 = newNode;
            }
        }
        return newHead;
    }
    
    public void insert(){
        if(head == null){
            head = createList();
            temp = head;
        }else{
            temp.next = createList();
            temp = temp.next;
        }
    }
    
    public void display(){
        if(head == null){
            System.out.println("Empty LL!");
        }
        
        ListNode t1 = head;
        while(t1 != null){
            System.out.print(t1.val + " -> ");
            t1 = t1.next;
        }
        System.out.print(" X \n");
    }

    public void displayList(int val){
        ListNode t1 = head;
        while(t1 != null && t1.val != val){
            t1 = t1.next;
        }
        ListNode temp = t1;  //listHead
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.child;
        }
        System.out.print(" X \n");
    }

    public void convertto1d(){
        //brute force approach
        ArrayList <Integer> arr = new ArrayList<>();
        ListNode temp = head;
        ListNode t2 = null;
        //O(n) - outer loop , O(m)- inner loop , total - O(n*m) - this is just for traversing all nodes and adding to array
        while(temp != null){
            t2 = temp;
            while(t2 != null){
                arr.add(t2.val);
                t2 = t2.child;
            }
            temp = temp.next;
        }
        Collections.sort(arr);  //O(x log x), x=n*m - sorting the array, Space complexity - O(n*m) for the array to store all the nodes, n*m nodes 
        ListNode dummyNode = new ListNode(-1);
        temp = dummyNode;
        //O(n*m): Creating a new LL having ALL the nodes so n*m nodes, Space complexity- O(n*m) for the new LL 
        for(int i=0; i< arr.size(); i++){
            ListNode newNode = new ListNode(arr.get(i));
            temp.child = newNode;
            temp = newNode;
        }
        head = dummyNode.child;

        //Overall Space- O(2*m*n) ~ O(n*m), Overall Time - O(n*m) + O(n log n) + O(n*m) ~ O(n*m) (as n*m will be larger than n log n for larger values of n and m)

        //display- can create a seperate function also 
        temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.child;
        }
        System.out.print(" X \n");
    }

    //optimised - use the property that each child list is already sorted

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;
        while(l1 != null && l2!= null){
            if(l1.val < l2.val){
                res.child = l1;
                res = l1;
                l1 = l1.child;
            }else{
                res.child = l2;
                res = l2;
                l2 = l2.child;
            }
            res.next = null;
        }

        if(l1!= null){
            res.child = l1;
        }else{
            res.child = l2;
        }
        return dummyNode.child;
    }
//not working as expected
    public ListNode convertto1dOptimised(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mergedHead =  convertto1dOptimised(head.next);
        return mergeTwoLists(head, mergedHead);
    }

    public void displayFlattenedList(ListNode head){
        temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.child;
        }
        System.out.print(" X \n");
    }
}
public class Flatten
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int choice = 0;
        LL list = new LL();
        while(choice != 6){
            System.out.println("Menu: \n1. Press 1 to insert\n2. Press 2 to display\n3. Press 3 to display node list\n4. Convert to ID\n5. Press 5 to flatten optimally \n6. Press 6 to exit\n");
            choice = sc.nextInt();
            switch(choice){
                case 1: list.insert();
                break;
                case 2: list.display();
                break;
                case 3: System.out.println("Enter the head of the list to be displayed: ");
                        int val = sc.nextInt();
                        list.displayList(val);
                break;
                case 4: list.convertto1d();
                break;
                case 5: list.displayFlattenedList(list.convertto1dOptimised(list.head));
                break;
                case 6: System.out.println("Exiting...");
                break;
                default: System.out.println("Invalid option!!");
            }
        }
        sc.close();
	}
}