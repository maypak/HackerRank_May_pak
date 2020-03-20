import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String AFirstLetter = A.substring(0, 1).toUpperCase();
        String BFirstLetter = B.substring(0, 1).toUpperCase();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 1 ? "Yes" : "No");
        System.out.println(AFirstLetter + A.substring(1) 
                           + " " + BFirstLetter + B.substring(1));
    }
}