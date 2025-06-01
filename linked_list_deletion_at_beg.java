//Write a program to delete a node of linked list at the beginning of the list.
public class linked_list_deletion_at_beg {
    static Node head;
    linked_list_deletion_at_beg(){
        head=null;
    }

    static void printData(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"---->");
            curr=curr.next;
        }
        System.out.print("null");
    }

     static void deleteAtTheBeginning(){
        head = head.next;
    }

    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        deleteAtTheBeginning();
        printData(head);
        System.out.println();

    }
}
