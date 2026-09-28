import java.util.*;

public class FirstNegative {

    static List<Integer> firstNegInt(int[] arr, int k) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;

        java.util.Queue<Integer> q = new LinkedList<>();

        // Store indexes of negative numbers
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Process every window
        for (int i = 0; i <= n - k; i++) {

            // Remove indexes outside the window
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }

            // First negative number in window
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                ans.add(arr[q.peek()]);
            } 
            else {
                ans.add(0);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        int k = 3;

        List<Integer> ans = firstNegInt(arr, k);

        System.out.println(ans);
    }
}