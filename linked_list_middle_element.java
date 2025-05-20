public class linked_list_middle_element {
    static Node head;

    static void printData(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "---->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    static int length() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    static void middleNumber(){
        int len = length();
        if ( len == 0){
            System.out.println("List is Empty");
        }
        int middle = len / 2;
        Node curr = head;
        for( int i = 0; i < middle; i++){
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printData(head);
        System.out.println();
        System.out.println("Middle Element is: ");
        middleNumber();
    }
}