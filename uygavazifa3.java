import java.util.Scanner;

public class uygavazifa3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nechi ball oldingiz :");
        int n =  input.nextInt();

        if (n >= 90 && n <= 100){
            System.out.println("Alo");
        }
        else if(n >= 70 && n <= 89){
            System.out.println("Yaxshi");
        }
        else if (n >= 60 && n <= 69){
            System.out.println("Qoniqarli");
        }
        else {
            System.out.println("qoniqarsiz");
        }
    }
}