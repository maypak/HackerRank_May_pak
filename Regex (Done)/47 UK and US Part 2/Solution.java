import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String str[] = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = scan.nextLine();
        }
       
        int k = Integer.parseInt(scan.nextLine());
        for(int j = 0; j < k; j++) {
            int count = 0;
            String text = scan.nextLine();
            String fixedText = text.replace("our","or");
            for(int i = 0; i < n; i++){
                Pattern p = Pattern.compile("\\b" + text + "\\b" + "|" + "\\b" + fixedText + "\\b");
                Matcher m = p.matcher(str[i]);
            while(m.find()) {
            count++;
            }
        }
        System.out.println(count); 

        }    
    }
}