import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String str;
         int x, value,min,hour;
         x = sc.nextInt();
          value = x;
         min = value%100;


       value = value/100;
     
      if ( value > 12 && value <=124){
          str = "pm";
     } else { 
       str = "am";
     }
     hour = value/2;
    System.out.println( x + " >>> " + hour + " : " + min + str);
}
} 





















       