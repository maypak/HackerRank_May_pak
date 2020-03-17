import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i ++) {
            int n = sc.nextInt();
            if(n == 2) {
                System.out.println("Prime");
                continue;
            }
            
            if(n == 1 || n % 2 == 0) {
                System.out.println("Not prime");
                continue;
            }

            boolean notPr = false;
            for(int j = 3; j < n; j += 2) {
                if(n % j ==0) {
                    notPr = true;
                    break;
                }
            }
            if(notPr) {
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }
        sc.close();
    }
}
