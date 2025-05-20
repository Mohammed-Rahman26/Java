public class linked_list_deletion_at_last {
    static Node head;

    linked_list_deletion_at_last() {
        head = null;
    }

    static void printData(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "---->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    static void deletion() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        deletion();
        printData(head);
        System.out.println();
    }
}