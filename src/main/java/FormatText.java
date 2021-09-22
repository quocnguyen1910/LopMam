import java.util.Scanner;

public class FormatText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chu vào đây:");
        String input = scanner.nextLine();
        String output = "";

        char ch = input.charAt(0);

//        if (Character.isUpperCase(c)) {
        if (ch >= 'A' && ch <= 'Z') {
            output = input.toLowerCase();
        } else {
            output = input.toUpperCase();
        }

        System.out.println("output = " + output);

//        if (ch >= 'A' && ch <= 'Z')
//            System.out.println("\n" + ch +
//                    " is an UpperCase character");
//
//        else if (ch >= 'a' && ch <= 'z')
//            System.out.println("\n" + ch +


//        char[] chars = input.toCharArray();     //chuyen ve dang ky tu
//        String output = "";
//
//        for (Character c : chars) {
//            System.out.println("c = " + c);
//            if (Character.isUpperCase(c)) {
//                 c.toString().toLowerCase();
//            }
//        }

    }


}
