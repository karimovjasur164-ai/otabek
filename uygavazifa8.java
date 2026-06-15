import java.util.Scanner;

public class uygavazifa8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarima = input.nextInt();
        int kun = input.nextInt();
        double tolov;

        if (kun <= 3) {
            tolov = jarima * 0.9;
        } else if (kun > 15) {
            tolov = jarima * 1.1;
        } else {
            tolov = jarima;
        }

        System.out.println(tolov);
    }
}
