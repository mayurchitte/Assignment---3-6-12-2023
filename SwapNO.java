import java.util.Scanner;

public class SwapNO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        if (isValidNumber(number)) {
            int swappedNumber = swapHalfs(number);
            System.out.println("Number after swapping halves: " + swappedNumber);
        } else {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        }
    }

    public static int swapHalfs(int number) {
        int firstHalf = number / 100;
        int secondHalf = number % 100;

        
        int swappedNumber = secondHalf * 100 + firstHalf;

        return swappedNumber;
    }

    public static boolean isValidNumber(int number) {
        return number >= 1000 && number <= 9999;
    }
}
