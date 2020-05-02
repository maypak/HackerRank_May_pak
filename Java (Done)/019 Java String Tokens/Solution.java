import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        stringToken(s);
    }
    public static void stringToken(String s) {
        if (s == null || s.equals("") || s.trim().equals("")) {
            System.out.println(0);
            return;
        }

        String delims = "[ !,?.\\_'@]+";
        String[] sArr = s.trim().split(delims);

        System.out.println(sArr.length);
        for(String t : sArr) {
            System.out.println(t);
        }
    }
}

