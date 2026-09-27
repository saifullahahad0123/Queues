import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class circularGame {
    public static void  find(Queue<Integer> q , int k){
    
     while (q.size() > 1) {
        for(int i = 0; i<=k; i++){
            int top = q.remove();
            q.add(top);
        }
        q.remove();
        
         }
     System.out.println("Winner = " + q.peek());

    }
    public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        find(q, 2);
 
    }
}
