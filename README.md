# ☕ Java Developer ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

> **Muallif:** Rahimjonov Otabek  
> **Mavzu:** `If - Else` Shart operatorlari va mantiq

---

## 📄 Masala sharti: 1-mashq (Exercise)
Berilgan yil **Kabisa yili** (Leap Year) ekanligini yoki yo'qligini aniqlaydigan Java dasturini yozing.

### 💡 Yechim kodi

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Yilni kiriting: ");
        int year = sc.nextInt();
        
        // Kabisa yili mantiqiy tekshiruvi
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - Kabisa yili.");
        } else {
            System.out.println(year + " - Kabisa yili emas.");
        }
        
        sc.close(); // Scanner resursini yopish
    }
}
```
## 📄 Masala sharti: 2-mashq (Exercise)
Berilgan Balldi (Alo , Yaxshi) ekanligini yoki yo'qligini aniqlaydigan Java dasturi yozing 

### 💡 Yechim kodi 
```java
import java.util.Scanner;

public class uygavazifa3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nechi ball oldingiz :");
        int n =  input.nextInt();
        
        //Balldi mantiqiy tekshirish
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
        sc.close();// Scanner resursini yopish
    }
}
```
## 📄 Masala sharti: 3-mashq (Exercise)
Berilgan Sondi (Palidrom) yoki (Palidrom) emasligini aniqlaydigonn Java dasuturini yozing 

## 💡 Yechim kodi 
```java
import java.util.Scanner;

public class uygavazifa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number :");
        int n =  input.nextInt();
        
        int a  = n / 100;
        int b = n % 10;
        
        //Foydanlanuvchi tarafdan kelyotgan sondi majburiy tekshirish 
        if (a == b){
            System.out.println("Palidrom :");
        }
        else {
            System.out.println("palidrom emas");
        }
        sc.close();// Scanner resursini yopish
    }
}
```
## 📄 Masala sharti: 4-mashq (Exercise)
