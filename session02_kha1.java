package session02_Kha1;

import java.util.Scanner;

public class session02_kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên dương N: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.err.println("Số nhập vào không hợp lệ");
            return; 
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // Xuất kết quả
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
    }
}
