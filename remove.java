import java.util.LinkedList;
import java.util.Queue;

public class remove {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int a = q.size();

        for (int i = 0; i < 3; i++) {

            int top = q.remove();
             q.add(top);
        } 
        q.remove();
         for (int i = 0; i < a; i++) {

            int top = q.remove();
             q.add(top);
        } 
        int s = q.size();
         for (int i = 0; i <s ; i++) {

            int top = q.remove();
            System.out.println(top);
             q.add(top);
        } 
    }
}
