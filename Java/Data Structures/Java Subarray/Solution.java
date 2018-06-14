import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
        in.close();
        int negativesubstrings = 0;
            for(int i = 0; i < n; i++){
                int j = i;
                while(j < n){
                        int[] temp = Arrays.copyOfRange(arr, i, j+1) ;
                        int sum = 0;
                        for(int k : temp){
                            sum += k;
                        }
                       // System.out.println("i=" + i + "j=" + j + "..." + sum + " ");
                        if(sum < 0){
                            negativesubstrings++;
                        
                        }
                    j++;
                }
            }
        System.out.println(negativesubstrings);
    }
}
