import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        //     int aItem = Integer.parseInt(aItems[i]);
        //     a[i] = aItem;
        // }
        for(int i = 0; i < n; i++) {
            a[(i + n - d) % n] = Integer.parseInt(aItems[i]);
        }

        scanner.close();

    //     for(int i = 0; i < d; i++) {
    //         a = leftRotate(a);
    //     }
        
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    // }

    // public static int[] leftRotate(int [] arr) {
    //     int[] res = new int[arr.length];
    //     for(int i = 0; i < arr.length; i++) {
    //         if((i - 1) == -1) {
    //             res[arr.length-1] = arr[i];
    //             continue;
    //         }
    //         res[i - 1] = arr[i];
    //     }
    //     return res;
    }

}
