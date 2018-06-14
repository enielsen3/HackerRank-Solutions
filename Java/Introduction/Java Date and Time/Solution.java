import java.util.Scanner;
import java.util.Calendar;

class Solution {
     
	static Calendar calendar = Calendar.getInstance();
	
    public static String getDay(String d, String m, String y){
    	calendar.set(Integer.parseInt(y), Integer.parseInt(m)-1, Integer.parseInt(d));
    	String[] week = {"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY",
                             "THURSDAY", "FRIDAY", "SATURDAY"};
    
    	return week[calendar.get(Calendar.DAY_OF_WEEK)-1];
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
