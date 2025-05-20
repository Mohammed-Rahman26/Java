public class linked_list_length {
    static Node head;

    static void printData(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
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

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printData(head);
        System.out.println();
        System.out.println("Length of linked list: " + length());
    }
}