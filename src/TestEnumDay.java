import java.util.Scanner;

/**
 * Created by Ирина on 23.04.17.
 */
public class TestEnumDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of week: (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)");
        String input = sc.next();
        Day day = Enum.valueOf(Day.class, input);
        System.out.println("Day: " + day);
        System.out.println("abbreviation: " + day.getAbbr());
        System.out.println("day is working day: " + day.isWorkingDay());
    }
}
