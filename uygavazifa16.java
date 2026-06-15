import java.util.Scanner;

public class uygavazifa16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int raqam = input.nextInt();

        if (raqam == 101 && raqam == 102) {
            System.out.println("101-o't o'chirish xizmati.");
        } else if (raqam == 103 && raqam == 104) {
            System.out.println("103-tez tibbiy yordam xizmati.");
        } else {
            System.out.println("Xizmat ko'rsatish raqami topilmadi");
        }
    }
}
