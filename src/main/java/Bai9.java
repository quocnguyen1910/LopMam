import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {

        int bsx;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số xe: ");
        bsx = scanner.nextInt();
        int n0 = bsx / 10000;
        int n1 = (bsx / 1000) % 10;
        int n2 = (bsx / 100) % 10;
        int n3 = (bsx / 10) % 10;
        int n4 = bsx % 10;
        int sum = n0 + n1 + n2 + n3 + n4;
        int point = sum % 10;
        System.out.println("Biển số " + point + " nút");
    }
}
