import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < n; i++) {
            ArrayList<Integer> ta = new ArrayList<Integer>();
            int d = sc.nextInt();
            for(int j = 0; j < d; j++) {
                ta.add(sc.nextInt());
            }
            arr.add(ta);
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                System.out.println("" + arr.get(a-1).get(b-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }
}