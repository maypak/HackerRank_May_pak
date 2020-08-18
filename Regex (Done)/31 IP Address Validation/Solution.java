import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Pattern p1 = Pattern.compile("^(([0-9]|[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.*){4}");
        Pattern p2 = Pattern.compile("^([a-f0-9]{0,4}:*){8}");
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            Matcher m1 = p1.matcher(str);
            Matcher m2 = p2.matcher(str);
            if(m1.matches()){
                System.out.println("IPv4");
            }else if(m2.matches()){
                System.out.println("IPv6");
            }else{
                System.out.println("Neither");
            }
        }
        
    }
}