import java.util.Scanner;

public class TinhTuoi {

    public static void main(String[] args) {
        int age;int now = 2021;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam sinh:");
        age = scanner.nextInt();
        int tuoi = now - age;
        System.out.println("tuoi = " + tuoi);

    }
}

