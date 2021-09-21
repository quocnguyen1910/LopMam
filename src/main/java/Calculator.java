import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = scanner.nextInt();
        System.out.println("nhap so b:");
        b= scanner.nextInt();
        c = a + b;
        System.out.println("tong cua a va b = "+ c);
        d = a - b;
        System.out.println("hieu cua a va b= " + d);
        e = a*b;
        System.out.println("tich cua a va b= "+ e);
        f = a/b;
        System.out.println("thuong cua a va b = " + f);





    }
}
