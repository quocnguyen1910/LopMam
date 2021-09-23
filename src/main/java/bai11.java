import java.util.Scanner;

public class bai11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }

        float delta = b * b - 4 * a * c;
        Float x1, x2;
        if (delta > 0) {
            float deltaSqrt = (float) Math.sqrt(delta);

            x1 = (-b + deltaSqrt) / (2 * a);
            x2 = (-b - deltaSqrt) / (2 * a);
            System.out.println("Phương Trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 =" + x2);
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        } else { //else if (delta<0)
            x1 = x2 = null;
            System.out.println(" Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        }
        }
    }

