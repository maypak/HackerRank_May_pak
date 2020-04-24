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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        System.out.println(maxConsecutiveBinaryCount(n));
    }

    public static int maxConsecutiveBinaryCount(int n) {
        String s = Integer.toBinaryString(n);
        String[] sArr = s.split("0");
        int maxNum = 0;
        for(String t : sArr) {
            if(t.length() > maxNum) maxNum = t.length();
        }
        return maxNum;
    }
}
