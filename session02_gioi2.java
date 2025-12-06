package session02_Gioi2;

import java.util.Scanner;

public class session02_gioi2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập cạnh a:");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh b:");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh c:");
        c = Integer.parseInt(sc.nextLine());

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.err.println("Ba cạnh không tạo thành tam giác");
        } else {
            if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân");
            } else if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
                System.out.println("Tam giác vuông");

            } else {
                System.out.println("Không thuộc các loại trên");
            }
        }
    }
}
