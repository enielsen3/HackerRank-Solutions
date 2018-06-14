import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] arr = A.toCharArray();
        int left = 0;
        int right = arr.length-1;
        
        for(left = 0; left < right; left ++, right-- ){
            char tempchar = arr[left] ;
            arr[left] = arr[right];
            arr[right] = tempchar;
        }
        
        String B = new String(arr);
        if(A.compareTo(B)==0){
            System.out.print("Yes");
        }
        else {
            System.out.println("No");
           // System.out.println(A + " " + B);
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



