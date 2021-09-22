import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Bai8 {


    public static void main(String[] args) {

        int bankinh;
        double chuvi;
        double dientich;
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn: ");
        bankinh = scanner.nextInt();
        chuvi = (bankinh * 2) * pi;
        System.out.println("Chu vi hình tròn là: " + chuvi);
        double luythua;
        luythua = Math.pow(bankinh, 2);
        dientich = luythua * pi;
        System.out.println("Diện tích hình tròn là: " + dientich);

    }
}
