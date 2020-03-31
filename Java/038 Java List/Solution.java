import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();

        String[] sArr = sc.nextLine().split(" ");
        for(String s : sArr) {
            arr.add(Integer.parseInt(s));
        }

        int q = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < q; i ++) {
            String order = sc.nextLine();

            if("Insert".equals(order)) {
                String[] tArr = sc.nextLine().split(" ");
                arr.add(Integer.parseInt(tArr[0]), Integer.parseInt(tArr[1]));
            } else if ("Delete".equals(order)) {
                String[] tArr = sc.nextLine().split(" ");
                arr.remove(Integer.parseInt(tArr[0]));
            }
        }

        for(Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}