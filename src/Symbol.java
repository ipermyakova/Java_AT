import java.util.Scanner;

/**
 * Created by IPermyakova on 20.04.2017.
 */
public class Symbol {
    public static void main(String[] arg) {
        System.out.println("Enter the distance from the symbol \"\\\"");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char newSymbol = getSymbol(a);
        System.out.print(newSymbol);


    }

    public static char getSymbol(int a) {
        char symbol = '\\';
        char newSymbol = (char) (symbol + a);
        return newSymbol;
    }
}
