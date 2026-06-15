import java.util.Scanner;

public class uygavazifa18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("Natija 20");
        } else if (a != b && b != c && a != c) {
            System.out.println("Natija 0");
        } else {
            System.out.println("Natija 10");
        }
    }
}
