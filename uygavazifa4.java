import java.util.Scanner;

public class uygavazifa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int n =  input.nextInt();
        int a  = n / 100;
        int b = n % 10;

        if (a == b){
            System.out.println("Palidrom :");
        }
        else {
            System.out.println("palidrom emas");
        }
    }
}
