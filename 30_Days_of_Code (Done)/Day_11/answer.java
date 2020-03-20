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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println(arrayScanner(arr));
    }

    public static int arrayScanner(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int t = 0;
                t += arr[i][j];
                t += arr[i][j+1];
                t += arr[i][j+2];
                t += arr[i+1][j+1];
                t += arr[i+2][j];
                t += arr[i+2][j+1];
                t += arr[i+2][j+2];

                if(t > maxVal) maxVal = t;
            }
        }
        return maxVal;
    }
}
