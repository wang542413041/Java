import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

   public static void main(String args[]) {
      Enumeration<String> days;
      Vector<String> dayNames = new Vector<String>();
      dayNames.add("周一");
      dayNames.add("周二");
      dayNames.add("周三");
      dayNames.add("周四");
      dayNames.add("周五");
      dayNames.add("周六");
      dayNames.add("周日");
      days = dayNames.elements();
      while (days.hasMoreElements()){
         System.out.println(days.nextElement()); 
      }
   }
}