import java.util.Scanner;

public class uygavazifa19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quvvat = input.nextInt();

        if (quvvat <= 100) {
            System.out.println("Mashinada quvvat miqdori yetarlicha");
        } else if (quvvat <= 40) {
            System.out.println("Mashinada kam zaryad miqdori mavjud");
        } else if (quvvat < 20) {
            System.out.println("Mashinani qayta quvvatlang");
        }
    }
}
