import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int k : series(a,b,n)) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static int[] series (int a, int b, int n) {
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            int t = a;
            for(int j = 0; j <= i; j++) {
                t += (int)Math.pow(2,j) * b;
            }
            res[i] = t;
        }
        return res;
    }
}