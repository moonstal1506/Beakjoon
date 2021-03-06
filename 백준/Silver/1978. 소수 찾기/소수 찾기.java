import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(isPrime(num)) cnt++;
        }
        System.out.println(cnt);

    }

    private static boolean isPrime(int num) {
        if(num==1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }

}
