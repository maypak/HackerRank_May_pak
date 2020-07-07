import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String s=sc.next();
            String regex="^[_.][0-9]+[a-zA-Z]*[_]?$";
            if(Pattern.matches(regex,s))
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
        sc.close();
    }
}