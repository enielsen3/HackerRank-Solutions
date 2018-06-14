import java.io.*;
import java.util.*;


public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int length = a.length;    
        int[] b = new int[length];
            for (int i = 0; i < length; i++){
                b[i]=a[a.length-(i+1)];
            }
        return b;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int length = scanner.nextInt();
      
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
        	arr[i] = scanner.nextInt();
        }
        
        int[] reverse = reverseArray(arr);

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(String.valueOf(reverse[i]));

          if (i != reverse.length - 1) {
          	System.out.print(" ");
            }
        scanner.close();
        }

     }
}
