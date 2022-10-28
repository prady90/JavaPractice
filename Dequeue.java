import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> uniqueSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            uniqueSet.add(num);
            if (deque.size() == m) {
                System.out.println(deque);
                System.out.println(uniqueSet);

                if (max < uniqueSet.size()) {
                    max = uniqueSet.size();
                }
                int removeItem = deque.remove();
                if (!deque.contains(removeItem)) {
                    uniqueSet.remove(removeItem);
                }

            }

        }
        System.out.println(max);
        in.close();
    }
}
