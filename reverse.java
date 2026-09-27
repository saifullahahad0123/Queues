import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
         Stack<Integer> st = new Stack<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int a = q.size();

        for (int i = 0; i < a; i++) {

            int top = q.remove();
             st.push(top);
        } 
        int n = st.size();
        for(int i =0 ; i<n; i++){
            int top = st.pop();
            q.add(top);
        }
          for (int i = 0; i <a ; i++) {

            int top = q.remove();
            System.out.println(top);
             q.add(top);
        } 
       
    }
}

