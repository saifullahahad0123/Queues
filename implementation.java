class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class find {

    Node head;
    Node tail;
    int size;

    // Peek / Front
    int peek() {

        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return head.val;
    }

    // Remove / Dequeue
    int remove() {

        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = head.val;

        head = head.next;

        size--;

        // If queue becomes empty
        if (head == null) {
            tail = null;
        }

        return front;
    }

    // Add / Enqueue
    void add(int val) {

        Node temp = new Node(val);

        if (tail == null) {

            head = tail = temp;

        } else {

            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    // Display
    void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + " ");

            temp = temp.next;
        }

        System.out.println();
    }
}


public class implementation {

    public static void main(String[] args) {

        find q = new find();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display();

        System.out.println("Peek = " + q.peek());

        System.out.println("Removed = " + q.remove());

        q.display();

        System.out.println("Peek = " + q.peek());
    }
}