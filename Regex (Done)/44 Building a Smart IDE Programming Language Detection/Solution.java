import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        String type = null;
        while(scan.hasNext()) {
            if(text.contains("import java.") || text.contains("System.out")) {
                type = "Java";
                break;
            } else if (text.contains("#include")) {
                type = "C";
                break;
            } else if (text.contains("def ") || text.contains("print ")) {
                break;
            }
            text = scan.next();
        }
        if(type == null) {
            type = "Python";
        }
        System.out.println(type);

    }
}