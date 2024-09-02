import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
//        int num = 1;
        String text = new Scanner(System.in).next();
        String t = readBook(text);
        printHello(t);

    }

    public static String readBook(String text) {
        String hello = "Hello " + text;
        return hello;
    }

    public static void printHello(String text) {
        System.out.println(text);
    }
}
