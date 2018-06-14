import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        
        try(Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
            
        catch(ArithmeticException e ){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
