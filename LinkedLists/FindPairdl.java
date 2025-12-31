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

    public void findpairs(int sum){
        //Brute force O(n^2)
       ListNode temp1 = head;
       ListNode temp2 = null;
       while(temp1.next != null){
        temp2 = temp1.next;
        while(temp2 != null){
            int val = temp1.val + temp2.val;
            if(val == sum){
                System.out.println("Pair found: ("+temp1.val+", "+temp2.val+")");
            }else if(val > sum){
                break;   //added this because it is sorted and once i find a greater value further all values will give greater result so no need to check
            }
            temp2 = temp2.next;  
        }
        temp1 = temp1.next;
       }
    }

    public void findpairs2(int sum){
        //two pointer approach - O(n)
        ListNode left = head;
        ListNode right = head;
        while(right.next != null){
            right = right.next;
        }

        while(left != right && left.prev != right){
            int val = left.val + right.val;
            if(val == sum){
                System.out.println("Pair found: ("+left.val+", "+right.val+")");
                left = left.next;
                right = right.prev;
            }
            else if(val < sum){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
    }
}
public class FindPairdl{
    public static void main(String args[]){
        DLL dl = new DLL();
        int choice = 0;
        while(choice != 4){
            System.out.println("1. Insert\n2. Display\n3. Find the pairs\n4. Exit");
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
                case 3: System.out.println("Find the pairs of the sum.Enter the sum: ");
                        int sum = sc.nextInt();
                        dl.findpairs2(sum);
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

