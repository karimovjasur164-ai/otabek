import java.util.Scanner;

public class uygavazifa20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int onlar = n % 10;
        int birlar = n / 10;

        String natija = "";

        if (onlar == 1) natija += "o'n ";
        else if (onlar == 2) natija += "yigirma ";
        else if (onlar == 3) natija += "ottiz ";
        else if (onlar == 4) natija += "qirq ";
        else if (onlar == 5) natija += "ellik ";
        else if (onlar == 6) natija += "oltmish ";
        else if (onlar == 7) नजmish ";
        else if (onlar == 8) natija += "sakkison ";
        else if (onlar == 9) natija += "to'qson ";

        if (birlar == 1) natija += "bir";
        else if (birlar == 2) natija += "ikki";
        else if (birlar == 3) natija += "uch";
        else if (birlar == 4) natija += "to'rt";
        else if (birlar == 5) natija += "besh";
        else if (birlar == 6) natija += "olti";
        else if (birlar == 7) natija += "yetti";
        else if (birlar == 8) natija += "sakkiz";
        else if (birlar == 9) natija += "to'qqiz";

        System.out.println(natija.trim());
    }
}
