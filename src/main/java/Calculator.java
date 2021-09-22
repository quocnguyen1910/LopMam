import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = scanner.nextInt();
        System.out.println("nhap so b:");
        b = scanner.nextInt();
        String PhepTinh;
        System.out.println("Nhập phép tính :");
        PhepTinh = scanner.next();
        if (PhepTinh.equals("+")) {
            int c = a + b;
            System.out.println("Tổng của a va b = " + c);
        } else if (PhepTinh.equals("-")) {
            int d = a-b;
            System.out.println("Hiệu của a và b: " + d);
        }else if(PhepTinh.equals("*")){
            int e = a * b;
            System.out.println("Tích của a và b: " + e);
        }else if(PhepTinh.equals("/")){
            int f = a / b;
            System.out.println("Thương của a và b: " + f);
        } else {
            System.out.println("ban can nhap ");
        }

    }
}
