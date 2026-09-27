import java.util.*;

public class printQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int a = q.size();

        for (int i = 0; i < a; i++) {

            int top = q.remove();

            System.out.println(top);

            q.add(top);
        }
    }
}