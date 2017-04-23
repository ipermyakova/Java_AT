import java.io.*;
import java.util.Scanner;

/**
 * Created by Ирина on 19.04.17.
 */
public class Person {

    public static void main(String[] arg) throws IOException {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = 0;
        int sum = 0;
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, surname and age of people through a space in one line");
            line = sc.nextLine();
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i = i + 3) {
            String name = arr[i];
            String surname = arr[i + 1];
            int age = Integer.parseInt(arr[i + 2]);
            if (age > max) {
                max = age;
            }
            if (age < min) {
                min = age;
            }
            sum += age;
            n++;
            System.out.println(surname.substring(0, 1).toUpperCase() + surname.substring(1) + " "
                    + name.substring(0, 1).toUpperCase() + name.substring(1) + " "
                    + age);
            }

        double avr = (double)sum / n;
        System.out.println("The smallest age: " + min);
        System.out.println("The biggest age: " + max);
        System.out.println("Average age: "+ String.format("%.2f", avr));

    }
}
