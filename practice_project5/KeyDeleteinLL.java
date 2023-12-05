package practice_project5;

class Node {
    int value;
    Node next;

    public Node(int valuea) {
        this.value = valuea;
        this.next = null;
    }
}

class KeyDeleteinLL {
    private Node head;

    public KeyDeleteinLL() {
        head = null;
    }

    // Insert a new node at the end of the list
    public void insert(int valuea) {
        Node n1 = new Node(valuea);
        if (head == null) {
            head = n1;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n1;
        }
    }

    // Delete the first occurrence of a key
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty. Deletion is not possible.");
            return;
        }

        if (head.value == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value != key) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Key not found in the list.");
        } else {
            current.next = current.next.next;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        KeyDeleteinLL list = new KeyDeleteinLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Linked List:");
        list.display();

        int keyToDelete = 3;
        list.delete(keyToDelete);

        System.out.println("Linked List after deleting " + keyToDelete + ":");
        list.display();
    }
}
