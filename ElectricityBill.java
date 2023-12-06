import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int  units;
        double amount;
        System.out.print("Enter the name: ");
         name = sc.nextLine();

        System.out.print("Enter the units consumed: ");
         units = sc.nextInt();

        
         amount = calculateElectricityBill(units);

        
        System.out.println("Name: " + name);
        System.out.println("Units: " + units);
        System.out.println("Amount: " + amount);

       
    }

    private static double calculateElectricityBill(int units) {
        double bill = 0;

        
        if (units <= 100) {
            bill = units * 4;
        } else {
            
            bill += 100 * 4;
            units -= 100;

            if (units <= 200) {
                bill += units * 5;
            } else {
                
                bill += 200 * 5;
                units -= 200;

                bill += units * 10;
            }
        }

       
        if (bill > 1000) {
            
            bill += bill * 0.05;
        }

       
        bill += bill * 0.18;
       return bill;

       
    }
}
