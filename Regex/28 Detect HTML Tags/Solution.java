import java.io.*;
import java.util.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Pattern p = Pattern.compile("<(?!/)(.*?)(\\s|>)");
        TreeSet<String> list = new TreeSet<>();
        while(0 <= --n) {
            String s = sc.nextLine();
            Matcher m = p.matcher(s);
            while(m.find()) {
                list.add(m.group(1));
            }
        }

        while (!list.isEmpty()) {
            System.out.print(list.pollFirst());
            System.out.print((!list.isEmpty()) ? ";" : "");
        }

    }
}
