import java.util.Scanner;

public class uygavazifa7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a =   input.nextInt();

        if(a % 10 ==0 && a / 100 ==1){
            System.out.println("Elektronmobiling kerakli zaryadi : ");
        }
        else if (a % 10 ==1 && a / 100 !=0){
            System.out.println("Elektronmobiling kerakli yurish km  : ");
        }
        else {
            System.out.println("Elektronmobiling kerakli S : ");
        }
    }
}