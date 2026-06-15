import java.util.Scanner;

public class uygavazifa15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double minimumWage = input.nextDouble();
        double soliq;

        if (salary <= 5 * minimumWage) {
            soliq = salary * 0.09;
        } else if (salary <= 10 * minimumWage) {
            soliq = salary * 0.16;
        } else {
            soliq = salary * 0.23;
        }

        System.out.println(soliq);
    }
}
