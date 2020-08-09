import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while (n-->0) {
            String s = scan.nextLine();
            if (Pattern.matches("^(hackerrank).*\\1$|^(hackerrank)$",s)){
                System.out.println(0);
            }  
            else if (Pattern.matches("^(hackerrank).*",s)) {
                System.out.println(1);
            } 
            else if (Pattern.matches(".*hackerrank$",s)) {
                System.out.println(2);
            }  
            else {
                System.out.println(-1);
            }

        }
        scan.close();
    }
}