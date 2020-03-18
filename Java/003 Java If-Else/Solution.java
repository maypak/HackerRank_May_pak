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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(checkIfWeird(N));
    }

    public static String checkIfWeird(int n) {
        if(n > 20 || (n >= 2 && n < 5 )) {
            if(n % 2 == 0) return "Not Weird";
        }
        return "Weird";
    }
}
