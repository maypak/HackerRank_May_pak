import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        int l = A.length();
        for (int i = 0; i < l/2; i++) {
            if(A.charAt(i) != A.charAt(l -i -1)) isPalindrome = false;
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}