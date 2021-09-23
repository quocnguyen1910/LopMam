import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập số c: ");
        int c = scanner.nextInt();
        System.out.println("Nhập số d: ");
        int d = scanner.nextInt();
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));

    }
}

