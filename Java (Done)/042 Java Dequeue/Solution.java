import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if(deque.size() == m) {
                if(set.size() > max) max = set.size();
                int t = (int) deque.remove();
                if(!deque.contains(t)) set.remove(t);
            }
           
        }
        System.out.println(max);
    }
}