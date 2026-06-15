import java.util.Scanner;

public class uygavazifa5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number  :");
        int n = input.nextInt();

        int a = n / 100 ;
        int b = (n / 10) % 10;
        int c = n % 10;


        if((a < b && b < c) || (a > b && b > c)){
            System.out.println("Ketma - ket o'suvchi :");
        }
        else{
            System.out.println("kamayuvchi :");
        }

    }
}