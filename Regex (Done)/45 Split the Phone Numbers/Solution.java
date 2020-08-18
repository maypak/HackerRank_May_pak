import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n-- >0){
            String text = scan.nextLine();
            Pattern p = Pattern.compile("(\\d{1,3})[\\s-]?(\\d{1,3})[\\s-]?(\\d{4,10})");
            Matcher m = p.matcher(text);
            if(m.find()){
                System.out.println("CountryCode=" + m.group(1) + ",LocalAreaCode=" + m.group(2) + ",Number=" + m.group(3));
            }
        }
    }
}