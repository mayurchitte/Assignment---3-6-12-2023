import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int Days = sc.nextInt();

        convertDays(Days);
    }

    public static void convertDays(int Days) {
        int years = Days / 365;
        int remainingDays = Days % 365;

        int months = 0;
        int weeks = 0;
        int days = 0;

        if (remainingDays >= 30) {
            months = remainingDays / 30;
            remainingDays %= 30;
        }

        if (remainingDays >= 7) {
            weeks = remainingDays / 7;
            remainingDays %= 7;
        }

        days = remainingDays;

        System.out.println("Converted time: " + years + " years, " + months + " months, " + weeks + " weeks, " + days + " days");
    }
}
