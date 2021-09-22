import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = scanner.nextInt();
        System.out.println("nhap so b:");
        b= scanner.nextInt();
        int c = a + b;
        System.out.println("tong cua a va b = "+ c);
        int d = a - b;
        System.out.println("hieu cua a va b= " + d);
        int e = a*b;
        System.out.println("tich cua a va b= "+ e);
        int f = a/b;
        System.out.println("thuong cua a va b = " + f);





    }
}
