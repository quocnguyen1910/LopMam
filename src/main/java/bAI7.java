import java.sql.SQLOutput;
import java.util.Scanner;

public class bAI7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int DToan;
        int Hsotoan;
        int DLy;
        int Hsoly;
        int DHoa;
        int Hsohoa;

        System.out.println("Tên học sinh: ");
        name = scanner.nextLine();
        System.out.println("Nhập Điểm Toán: ");
        DToan = scanner.nextInt();
        System.out.println("Hệ Số Toán: ");
        Hsotoan = scanner.nextInt();
        System.out.println("Nhập Điểm Lý: ");
        DLy = scanner.nextInt();
        System.out.println("Hệ Số Lý: ");
        Hsoly = scanner.nextInt();
        System.out.println("Nhập Điểm Hóa: ");
        DHoa = scanner.nextInt();
        System.out.println("Hệ Số Hóa: ");
        Hsohoa = scanner.nextInt();
        int DTrungBinh = (DToan * Hsotoan + DLy * Hsoly + DHoa * Hsohoa) / (Hsotoan + Hsoly + Hsohoa);
        System.out.println("Điểm Trung Bình Là: " + DTrungBinh);
        if (DTrungBinh >= 7 && DTrungBinh < 9) {
            System.out.println("Học Sinh Khá");
        } else if (DTrungBinh >= 9) {
            System.out.println("Học Sinh Giỏi");
        } else {
            System.out.println("Học Sinh Trung Bình");
        }
    }
}
