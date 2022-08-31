import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Day: ");
        int days = input.nextInt();
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println(seconds + " are the seconds in " + days + " days.");
    }
}