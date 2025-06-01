class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//Node creation ends here.

//Create a linked list.
public class linked_list_creation {
    static Node head;
    linked_list_creation(){
        head=null;
    }

    static void printData(Node head){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"---->");
            current=current.next;
        }
        System.out.print("null");
    }

    static int sum(Node head){
        int sum=0;
        Node cur=head;
        while (cur != null){
            sum=sum +cur.data;
            cur=cur.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printData(head);
        System.out.println();
        System.out.println("sum of all elements "+sum(head));


    }
}
