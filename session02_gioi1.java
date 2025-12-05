package session02_Gioi1;

import java.util.Scanner;

public class session02_gioi1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập một số nguyên N:");
        int n = Integer.parseInt(sc.nextLine());

        if (n < 0) {
            n = -n;
        }
        int sum = 0;
        while (n > 0) {
            int chuso = n % 10;
            sum += chuso;
            n /= 10;
        }
        System.out.println("tổng các chữ số là: " + sum);


    }
}
