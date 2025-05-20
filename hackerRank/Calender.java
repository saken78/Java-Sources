
import java.time.LocalDate;
import java.util.Scanner;

class Calender {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int month = inputUser.nextInt();
        int day = inputUser.nextInt();
        int year = inputUser.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date.getDayOfWeek().toString());
    }
}
