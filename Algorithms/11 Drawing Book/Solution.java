import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int front = 0;
        int back = 0;
        int j = 1;
        for(int i = 1; i <= n; i = i+2){
            if(i >= p){
                break;
            }else{
                front++;
            }
        }
        int k = n;
        for(int i = n; i > 0;i = i-2){
            if(i % 2 == 0){
                if(i <= p){
                    break;
                }else{
                    back++;
                }
            }else{
                if(i <= p || i - 1 == p){
                    break;
                }else{
                    back++;
                }
            }
        }
        if(front<back){
            return front;
        }else{
            return back;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
