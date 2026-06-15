import java.util.Scanner;

public class uygavazifa12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 25) {
            System.out.println("oynalar ochilsin");
        } else {
            System.out.println("oynalar yopilsin");
        }
    }
}
