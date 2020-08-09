import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int query = scan.nextInt();
        Pattern p = Pattern.compile("^[A-Z]{5}\\d{4}[A-Z]$");
        Matcher m;
        String pan;
        while(scan.hasNext()){
            pan = scan.next();
            m = p.matcher(pan);
            if(pan.length() == 10 && m.find() == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}