import java.util.Scanner;

public class bai10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        if(a>b){
            System.out.println("Số lớn nhất là: " + a);
            System.out.println("số nhỏ nhất là: " + b);
        }else;
        System.out.println("số lớn nhất là: " + b);
        System.out.println("số nhỏ nhất là: " + a);
    }
}
