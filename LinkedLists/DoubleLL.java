import java.util.*;

class Node{
    int val;
    Node prev;
    Node next;
    public Node(int x){
        val = x;
        prev = null;
        next = null;
    }
}
class DoublyLL{
    Node start = null;
    public Node createNewNode(int x){
        Node newNode = new Node(x);
        return newNode;
    }

    public void insertAtEnd(){
        System.out.println("Enter the data you want to insert: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node newNode = createNewNode(x);
        if(start == null){
            start = newNode;
        }
        else{
            Node temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

     public int calcLength(){
        if(start == null){
            return 0;
        }else{
            int count = 0;
            Node temp = start;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public void insertAtBeg(){
        System.out.println("Enter the data you want to insert: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node newNode = createNewNode(x);
        if(start == null){
            start = newNode;
        }else{
            newNode.next = start;
            start = newNode;
            newNode.prev = null; //not needed but still
        }
    }

    public void insertAtPos(){
        displayLL();
        System.out.println("Enter the position you want to insert the node at: ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        System.out.println("Enter the value to be inserted: ");
        int x = sc.nextInt();
        Node newNode = createNewNode(x);
        if(pos<0 || pos>calcLength()){
            System.out.println("Invalid position, Please enter a valid position!");
        }
        else{
            if(start == null){
                System.out.println("Disclaimer: Linked List is empty! inserting at pos:0... ");
                start = newNode;
            }else{
                int count = 0;
                Node temp = start;
                while(count<pos){
                    temp = temp.next;
                    count++;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                if(temp.next != null){
                    temp.next= newNode;
                    temp.next.prev = newNode;
                }
                else{
                    temp.next= newNode;
                }
                
            }
        }
    }

    public int search(int x){
        if(start == null){
            return -1;
        }
        else{
            Node temp = start;
            int pos=0;
            while(temp.val != x && temp.next!= null){
                temp = temp.next;
                pos++;
            }
            if(temp.val == x){
                return pos;
            }else{
                return -1;
            }
        }
    }

    public void deleteAtEnd(){
        if(start == null){
            System.out.println("LL is empty!");
        }else if(start.next == null){
            start = null;
        }
        else{
            Node temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    public void deleteAtBeg(){
        if(start == null){
            System.out.println("LL is empty!");
        }else if(start.next == null){
            start = null;
        }else{
            start.next.prev = null;
            start = start.next;
        }
    }

    public void delete(){
        displayLL();
        System.out.println("Enter the value you want to delete: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pos = search(x);
        if( pos == -1){
            System.out.println("Element not found! Please enter the existing node from above Linked List ");
        }
        else{
            int count = 0;
            Node temp = start;
            while(count < pos){
                count++;
                temp = temp.next;
            }
            if(temp.next!=null){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            else{
                temp.prev.next = null;  //or we can also call delete at end
            }
        }
    }

    public void reverse() {
        if (start == null) {
            System.out.println("Empty LL!");
            return;
        }

        Node current = start;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            start = temp.prev;
        }
    }


    public void displayLL(){
        if(start == null){
            System.out.println("Empty Linked List");
        }
        else{
            Node temp = start;
            while(temp!= null){
                System.out.print(temp.val+ " -> ");
                temp = temp.next;
            }
            System.out.println("X");
        }
    }

}

public class DoubleLL {
    public static void main(String args[]){
        int choice=0;
        DoublyLL list = new DoublyLL();
        while(choice != 9){
            System.out.println("---- MENU ----\n1. CREATE/INSERT AT THE END\n2. INSERT AT BEGINNING\n3. DISPLAY \n4. INSERT AT SOME POSITION \n5. DELETE \n6. DELETE AT BEG\n7. DELETE AT END\n8. REVERSE\n9. EXIT");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1: list.insertAtEnd();
                break;
                case 2: list.insertAtBeg();
                break;
                case 3: list.displayLL();
                break;
                case 4: list.insertAtPos();
                break;
                case 5: list.delete();
                break;
                case 6: list.deleteAtBeg();
                break;
                case 7: list.deleteAtEnd();
                break;
                case 8: list.reverse();
                break;
                case 9: System.out.println("Exiting....\n");
                break;
                default: System.out.println("Invalid option");
            }
        }
        System.out.println("Total length = "+ list.calcLength());

    }
    
}
