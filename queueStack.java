import java.util.Stack;

class QueueUsingStack {

    Stack<Integer> st1;
    Stack<Integer> st2;

    QueueUsingStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    // Add / Enqueue
    void add(int val) {

        st1.push(val);
    }

    // Remove / Dequeue
    int remove() {

        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Move elements from st1 to st2
        if (st2.isEmpty()) {

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    // Peek
    int peek() {

        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (st2.isEmpty()) {

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.peek();
    }

    // Display
    void display() {

        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        // First show st2
        for (int i = st2.size() - 1; i >= 0; i--) {
            System.out.print(st2.get(i) + " ");
        }

        // Then show st1
        for (int i = 0; i < st1.size(); i++) {
            System.out.print(st1.get(i) + " ");
        }

        System.out.println();
    }
}


public class queueStack {

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();

        System.out.println("Peek = " + q.peek());

        System.out.println("Removed = " + q.remove());

        q.display();

        System.out.println("Removed = " + q.remove());

        q.display();
    }
}
