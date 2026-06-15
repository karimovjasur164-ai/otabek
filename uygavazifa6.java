import java.util.Scanner;

public class uygavazifa6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a =  input.nextInt();

        int  n = a /100;
        int s  = (a / 10)%10;
        if (n == s && s == a){
            System.out.println("hech bo'lmasa ikkitasi butun son  : ");
        }
        else if (s == n && a == s){
            System.out.println("hech bo'lmasa bittasi  butun son  : ");
        }
        else{
            System.out.println("uchtasi ham butun son emas : ");
        }
    }
}