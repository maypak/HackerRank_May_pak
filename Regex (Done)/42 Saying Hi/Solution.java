import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String regex="^[h|H][i|I]\\s[^d|^D].*";
        while(n --> 0) {
            String s = scan.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(s);
            if(m.find())
                System.out.println(m.group());
        }
    }
}