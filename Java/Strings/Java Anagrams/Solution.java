import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        String aSort = sortString(a.toLowerCase());
        String bSort = sortString(b.toLowerCase());
       // System.out.println(aSort + " " + bSort);
        return aSort.equals(bSort);
    }


    static String sortString(String a){
        char[] temp = a.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
        
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
