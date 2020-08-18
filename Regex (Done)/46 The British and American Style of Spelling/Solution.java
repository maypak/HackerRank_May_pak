import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        StringBuilder input = new StringBuilder();
        
        while(n-- > 0) 
            input.append(scan.nextLine());
        
        n = Integer.parseInt(scan.nextLine());
        while(n-- > 0) {         
            StringBuilder word = new StringBuilder(scan.nextLine());
            word.delete(word.length()-2, word.length());
            word.append("(z|s)e");
            
            int count = 0;
            Pattern p = Pattern.compile("(?s)"+word.toString());
            Matcher m = p.matcher(input);
            
            while(m.find())
                count++;
            
            System.out.println(count);
        }
       
        scan.close();
    }
}