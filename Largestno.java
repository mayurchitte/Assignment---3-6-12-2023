import java.util.Scanner;
public class Largestno  {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    
       System.out.println("Enter the 3 number :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int size = a>b?a:b; 
       
       int largest = c>size?c:size;

      System.out.println(" largest number is :  " + largest );
   }
}