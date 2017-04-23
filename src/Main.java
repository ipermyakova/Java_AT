import java.util.Random;
import java.util.Scanner;

/**
 * Created by IPermyakova on 20.04.2017.
 */
public class Main {
    public static void main(String[] args){
        //task1(args);
        //task2(args);
        //task3();
        task4(args);

    }
    public static void task1(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter n lines");
            return;
        }
        String[] arr = args;
        int sum = 0;
        double avrLength;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].length();
        }
        avrLength = (double) sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < avrLength) {
                System.out.println("Lines: " + arr[i] + " "
                        + " Length of lines: " + arr[i].length());
            }
        }
    }

    public static void task2(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter n words");
            return;
        }
        int count1 = 0;
        int count2 = 0;
        String[] arr = args;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("[a-zA-Z]+")) {
                count1++;
                int sizeConsonants = arr[i].toLowerCase().replaceAll("a|e|i|o|u", "").length();
                int sizeVowels = arr[i].length() - arr[i].toLowerCase().replaceAll("a|e|i|o|u", "").length();
                if (sizeConsonants == sizeVowels) {
                    count2++;
                }
            }

        }
        System.out.println("The number of words containing only the Latin alphabet: " + count1);
        System.out.println("Number of words with an equal number of vowels and consonants: " + count2);
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");
        String monthDesc = "";
        if(sc.hasNextInt()) {
            int month = sc.nextInt();
            if (month <= 12 && month >= 1) {
                switch(month) {
                    case 1:
                        monthDesc = "January";
                        break;
                    case 2:
                        monthDesc = "February";
                        break;
                    case 3:
                        monthDesc = "March";
                        break;
                    case 4:
                        monthDesc = "April";
                        break;
                    case 5:
                        monthDesc = "May";
                        break;
                    case 6:
                        monthDesc = "June";
                        break;
                    case 7:
                        monthDesc = "July";
                        break;
                    case 8:
                        monthDesc = "August";
                        break;
                    case 9:
                        monthDesc = "September";
                        break;
                    case 10:
                        monthDesc = "October";
                        break;
                    case 11:
                        monthDesc = "November";
                        break;
                    case 12:
                        monthDesc = "December";
                        break;
                }
            } else {
                System.out.println("Enter a number from 1 to 12");
            }
        } else {
            System.out.println("Enter a number from 1 to 12");
        }
        System.out.println(monthDesc);
    }

    public static void task4(String[] args) {
        if (args.length == 0 || args.length == 1) {
            System.out.println("Enter the dimension of the matrix and the column for sorting");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int max = n;
        int min = -n;
        Random random = new Random();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        System.out.println("Matrix of dimension " + n);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int m = 0;
        while(m != n - 1) {
            for (int i = 0; i < n - 1 - m; i++) {
                if (arr[i][k] > arr[i + 1][k]) {
                    for (int j = 0; j < n; j++) {
                        int temp = arr[i + 1][j];
                        arr[i + 1][j] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }
            }
            m++;
        }
        System.out.println();
        System.out.println("Sorted matrix by column " + k);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
