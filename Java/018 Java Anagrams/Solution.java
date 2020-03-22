import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;

        a = a.toUpperCase();
        b = b.toUpperCase();

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        
        java.util.Arrays.sort(aArr);
        java.util.Arrays.sort(bArr);

        boolean isAnagram = true;

        for(int i = 0; i < aArr.length; i++) {
            if(aArr[i] != bArr[i]) isAnagram = false;
        }

        return isAnagram;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
