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
Berilgan ballning darajasini (A'lo, Yaxshi, Qoniqarli, Qoniqarsiz) aniqlaydigan Java dasturini yozing.

### 💡 Yechim kodi
```java
import java.util.Scanner;

public class uygavazifa3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nechi ball oldingiz : ");
        int n =  input.nextInt();
        
        // Ballni mantiqiy tekshirish
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
        
        input.close(); // Scanner resursini yopish
    }
}
```

## 📄 Masala sharti: 3-mashq (Exercise)
Berilgan 3 xonali sonning **Palindrom** (chapdan ham, o'ngdan ham bir xil o'qiladigan) yoki palindrom emasligini aniqlaydigan Java dasturini yozing.

### 💡 Yechim kodi
```java
import java.util.Scanner;

public class uygavazifa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int n =  input.nextInt();
        
        int a  = n / 100;
        int b = n % 10;
        
        // Raqamlarni o'zaro solishtirish
        if (a == b){
            System.out.println("Palidrom :");
        }
        else {
            System.out.println("palidrom emas");
        }
        
        input.close(); // Scanner resursini yopish
    }
}
```

## 📄 Masala sharti: 4-mashq (Exercise)
Berilgan 3 xonali son raqamlarining ketma-ket **o'suvchi** yoki **kamayuvchi** tartibda joylashganligini aniqlaydigan Java dasturini yozing.

### 💡 Yechim kodi
```java
import java.util.Scanner;

public class uygavazifa5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number  : ");
        int n = input.nextInt();

        int a = n / 100 ;     // Yuzlar xonasi
        int b = (n / 10) % 10; // O'nlar xonasi
        int c = n % 10;       // Birlar Xonasi
        
        // Ketma-ketlikni tekshirish
        if((a < b && b < c) || (a > b && b > c)){
            System.out.println("Ketma - ket o'suvchi yoki kamayuvchi :");
        }
        else{
            System.out.println("tartibsiz yoki teng :");
        }
        
        input.close(); // Scanner resursini yopish
    }
}
```

## 📄 Masala sharti: 5-mashq (Exercise)
Berilgan 3 xonali son tarkibida hech bo'lmasa ikkita bir xil raqam borligini yoki raqamlarning hammasi har xil ekanligini aniqlaydigan Java dasturini yozing.

### 💡 Yechim kodi
```java
import java.util.Scanner;

public class uygavazifa6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a =  input.nextInt();

        int n = a / 100;       // Yuzlar xonasi
        int s = (a / 10) % 10; // O'nlar xonasi
        int birlik = a % 10;   // Birlar xonasi

        // Raqamlarni mantiqiy solishtirish
        if (n == s || s == birlik || n == birlik) {
            System.out.println("Hech bo'lmasa ikkita raqami teng!");
        } 
        else {
            System.out.println("Uchala raqami ham har xil!");
        }
        
        input.close(); // Scanner resursini yopish
    }
}
```
