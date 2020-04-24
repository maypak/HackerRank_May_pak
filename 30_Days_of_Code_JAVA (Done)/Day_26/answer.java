import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String [] rtDate = sc.nextLine().split(" ");
        String [] onDate = sc.nextLine().split(" ");
        int[] rt = new int[3];
        int[] od = new int[3];

        for(int i = 0; i < 3; i++) {
            rt[i] = Integer.parseInt(rtDate[i]);
            od[i] = Integer.parseInt(onDate[i]);
        }

        int fine = fineCalc(od, rt);
        System.out.println(fine);
    }
    public static int fineCalc(int[] od, int[] rt) {
        if(rt[2] - od[2] < 0) return 0;
        if(rt[2] - od[2] > 0) return 10000;
        if(rt[1] - od[1] > 1) return (rt[1] - od[1]) * 500;
        if(rt[0] - od[0] > 1) return (rt[0] - od[0]) * 15;

        return 0;
    }
}
