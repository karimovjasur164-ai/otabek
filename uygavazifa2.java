import java.util.Scanner;

public class uygavazifa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("kabis yilini kiriting : ");
        int n = sc.nextInt();
        if( (n % 4 ==0 && n % 100 !=0 )|| n % 400==0) {
            System.out.println("kabis yili");
        }
        else {
            System.out.println("kabis yili emas : ");
        }
    }
}