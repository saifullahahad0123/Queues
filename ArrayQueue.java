class Queue {

    int[] arr;
    int front;
    int rear;
    int size;

    Queue(int capacity) {

        arr = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Add / Enqueue
    void add(int val) {

        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }

        // Move rear circularly
        rear = (rear + 1) % arr.length;

        arr[rear] = val;

        size++;
    }

    // Remove / Dequeue
    int remove() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = arr[front];

        // Move front circularly
        front = (front + 1) % arr.length;

        size--;

        return value;
    }

    // Peek
    int peek() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    // Display
    void display() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int index = front;

        for (int i = 0; i < size; i++) {

            System.out.print(arr[index] + " ");

            index = (index + 1) % arr.length;
        }

        System.out.println();
    }
}


public class ArrayQueue {

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.display();

        System.out.println("Removed = " + q.remove());
        System.out.println("Removed = " + q.remove());

        q.display();

        // Reuse empty spaces
        q.add(60);
        q.add(70);

        q.display();

        System.out.println("Peek = " + q.peek());
    }
}