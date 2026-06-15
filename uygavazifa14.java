import java.util.Scanner;

public class uygavazifa14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("min = " + min + ", max = " + max);
    }
}
