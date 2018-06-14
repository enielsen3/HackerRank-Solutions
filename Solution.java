import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<int[]> arrL = new ArrayList();
        
        for(int i = 0; i < n; i++){
            int d = in.nextInt();
            int[] temp =  new int[d];
            for(int j = 0; j < d; j++){
                temp[j] = in.nextInt();
            }
             arrL.add(temp);
        }
        
        int q = in.nextInt();
        
        for(int i = 0; i < q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int[] temp = arrL.get(x-1);
            
            if(y <= temp.length) {
                System.out.println(temp[y-1]);
            }
            else {
                System.out.println("ERROR!");
            }
        }
        
        in.close();
    }
}
