package Day16;
import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static String getString(String message) {
        System.out.print(message);
        sc.nextLine();
        return sc.nextLine();
    }
    public static void main(String args []){
        int num = InputHelper.getInt("Enter a number: ");
        String sum = InputHelper.getString("Enter a String: ");
        System.out.println(num);
        System.out.println(sum);

    }

    // Add more methods like getDouble, getChar if needed
}
