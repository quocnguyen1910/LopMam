import java.util.Scanner;

public class ShowInteger {

    public static void main(String[] args) {
        int itg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số vào đây: ");
        itg = scanner.nextInt();
        if (itg > 1 & itg <= 9) {
            System.out.println("Số bạn vừa nhập là: " + itg);
        } else
            System.out.println("Không đọc được !");
    }
}
