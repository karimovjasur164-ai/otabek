import java.util.Scanner;

public class uygavazifa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chiroq = input.next();

        if (chiroq.equals("qizil")) {
            System.out.println("harakatlanishdan to'xtang");
        } else if (chiroq.equals("sariq")) {
            System.out.println("harakatlanishga tayyorlaning");
        } else if (chiroq.equals("yashil")) {
            System.out.println("harakatlanishni davom ettiring");
        }
    }
}
