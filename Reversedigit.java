package Day16;
import java.util.Scanner;
public class Reversedigit {
    public static int reverseDigits(int n){
        int rev = 0;
        while(n != 0){
            int digit = n%10;
            rev = rev*10 + digit;
            n /= 10;
        }
        return rev;
    } 
    public static boolean checkPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
public static int countDigits(int n) {
    int count = 0;
    while (n != 0) {
        count++;
        n /= 10;
    }
    return count;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(reverseDigits(n));
        System.out.println(countDigits(a));
        System.out.println(checkPrime(b));
    }
    
}
