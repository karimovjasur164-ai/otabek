import java.util.Scanner;

public class uygavazifa17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.next();

        if (password.equals("Aziz20")) {
            System.out.println("Assalomu alaykum Azizbek, Xush kelibsiz");
        } else {
            System.out.println("Siz xato passwordni kiritidingiz");
        }
    }
}
