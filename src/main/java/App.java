import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class App {

    static String global = "global variable";

    public static void main(String[] args){
        //String str;
        //str = "Data Type";
        String str = "Data Type";
        System.out.println(str);
        sum();

        final double PI = 3.14;
        System.out.println(PI);
        System.out.println("Name\tDOB");

        int i = 10;
        long l = 100;

        float f = 3.1f;
        double d = 5.1;

        char c = 'a';
        char c2 = '5';
        char c3 = 65;

        boolean b1 = true;
        boolean b2= false;

        Integer ref_i = 100;


//        int a = 100;
//        int b = 200;
//        System.out.println("a = " + a + " b = "+b);
//        swap(a, b);
//        System.out.println("a = " + a + " b = "+b);
//

        Integer a = 100;
        Integer b = 200;
        System.out.println("a = " + a + " b = "+b);
        swap(a, b);
        System.out.println("a = " + a + " b = "+b);

        SEASON se = SEASON.AUTUMN;
        System.out.println(se);


    }
        static void swap(Integer a, Integer b){
        a = 99;
//        Integer tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("a = " + a + " b = "+b);

    }

//    static void swap(int a, int b){
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("a = " + a + " b = "+b);
//
//    }

    public static void sum(){
        System.out.println(global);
    }
}
