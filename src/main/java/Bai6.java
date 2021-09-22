import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        String name;
        int soluong;
        int dongia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten SP: ");
        name = scanner.nextLine();
        System.out.println("Nhap so luong SP: ");
        soluong = scanner.nextInt();
        System.out.println("Nhap don gia: ");
        dongia = scanner.nextInt();
        int tien = soluong * dongia;
        System.out.println("Thanh Tien: " + tien);
        int thuegtgt = (tien * 10) / 100;
        System.out.println("thuegtgt: " + thuegtgt);


    }
}
