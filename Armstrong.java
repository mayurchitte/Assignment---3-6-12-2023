import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  a, b, c, d, Value;
        System.out.print(" Input : ");
         a = sc.nextInt();
         Value = a;
        
         b = a%10;
         a = a/10;
         c = a%10;
         a = a/10;
         d = a%10;

         
     

    if(((a*a*a)+(c*c*c)+(d*d*d)) == Value) {
            System.out.println(Value + " is an Armstrong number.");
        } else{
            System.out.println(Value + " is not an Armstrong number.");
          } 
  }
 }   