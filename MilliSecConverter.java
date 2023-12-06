import java.util.Scanner;

public class MilliSecConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" time in milliseconds: ");
        long milliseconds = sc.nextLong();

        convertMilliseconds(milliseconds);
    }

    public static void convertMilliseconds(long milliseconds) {
        
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        
        minutes %= 60;
        seconds %= 60;

        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
