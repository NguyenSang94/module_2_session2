package session02_Kha2;

import java.util.Scanner;

public class session02_kha2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1 đến 12:");
        int month = Integer.parseInt(sc.nextLine());

        int days;
        String monthName;

        switch (month) {
            case 1:
                monthName = "Tháng 1";
                days = 31;
                break;
            case 2:
                monthName = "Tháng 2";
                days = 28;
                break;
            case 3:
                monthName = "Tháng 3";
                days = 31;
                break;
            case 4:
                monthName = "Tháng 4";
                days = 30;
                break;
            case 5:
                monthName = "Tháng 5";
                days = 31;
                break;
            case 6:
                monthName = "Tháng 6";
                days = 30;
            case 7:
                monthName = "Tháng 7";
                days = 31;
                break;
            case 8:
                monthName = "Tháng 8";
                days = 31;
                break;
            case 9:
                monthName = "Tháng 9";
                days = 30;
                break;
            case 10:
                monthName = "Tháng 10";
                days = 31;
                break;
            case 11:
                monthName = "Tháng 11";
                days = 30;
                break;
            case 12:
                monthName = "Tháng 12";
                days = 31;
            default:
                System.out.println("Không hợp lệ");
                return;
        }
        System.out.printf("%s có %d ngày\n", monthName, days);

    }
}
