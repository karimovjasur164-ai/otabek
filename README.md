# ☕ Java Developer: Uy Vazifalari Jamlanmasi ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

> **Muallif:** Rahimjonov Otabek  
> **Mavzu:** `If - Else` Shart operatorlari, mantiqiy amallar, arifmetika va tiplarni o'zgartirish (Type Casting)

Ushbu repozitoriyada Java dasturlash tilini o'rganish davomida bajarilgan barcha amaliy topshiriqlar va kodlar jamlangan.

---

## 📁 Kodlar Ro'yxati va Masala Shartlari

### 📄 uygavazifa2.java: Ikki sonni solishtirish
Kiritilgan ikki butun sonning qaysi biri katta, kichik yoki o'zaro tengligini aniqlaydi.
```java
import java.util.Scanner;

public class uygavazifa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int a = input.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Katta son: " + a);
        } else if (b > a) {
            System.out.println("Katta son: " + b);
        } else {
            System.out.println("Sonlar teng.");
        }
        input.close();
    }
}
```

### 📄 uygavazifa3.java: Ball baholash tizimi
Natija balliga qarab talabaning bahosini aniqlaydi (A'lo, Yaxshi, Qoniqarli, Qoniqarsiz).
```java
import java.util.Scanner;

public class uygavazifa3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ballni kiriting: ");
        int n = input.nextInt();
        
        if (n >= 90 && n <= 100) {
            System.out.println("Alo");
        } else if (n >= 70 && n <= 89) {
            System.out.println("Yaxshi");
        } else if (n >= 60 && n <= 69) {
            System.out.println("Qoniqarli");
        } else {
            System.out.println("qoniqarsiz");
        }
        input.close();
    }
}
```

### 📄 uygavazifa4.java: Palindrom tekshiruvi
3 xonali sonning palindrom (chapdan ham, o'ngdan ham bir xil o'qiladigan) ekanligini tekshiradi.
```java
import java.util.Scanner;

public class uygavazifa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("3 xonali son kiriting: ");
        int n = input.nextInt();
        
        int a = n / 100;
        int b = n % 10;
        
        if (a == b) {
            System.out.println("Palidrom");
        } else {
            System.out.println("Palidrom emas");
        }
        input.close();
    }
}
```

### 📄 uygavazifa5.java: O'suvchi va kamayuvchi sonlar
3 xonali son raqamlarining tartib bilan o'suvchi yoki kamayuvchi ekanligini tekshiradi.
```java
import java.util.Scanner;

public class uygavazifa5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("3 xonali son kiriting: ");
        int n = input.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        
        if ((a < b && b < c) || (a > b && b > c)) {
            System.out.println("Ketma-ket o'suvchi yoki kamayuvchi");
        } else {
            System.out.println("Tartibsiz");
        }
        input.close();
    }
}
```

### 📄 uygavazifa6.java: Raqamlar o'xshashligi
3 xonali son ichida hech bo'lmasa ikkita raqam o'zaro bir xil ekanligini aniqlaydi.
```java
import java.util.Scanner;

public class uygavazifa6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("3 xonali son kiriting: ");
        int a = input.nextInt();

        int n = a / 100;
        int s = (a / 10) % 10;
        int birlik = a % 10;

        if (n == s || s == birlik || n == birlik) {
            System.out.println("Hech bo'lmasa ikkita raqami teng!");
        } else {
            System.out.println("Uchala raqami har xil");
        }
        input.close();
    }
}
```

### 📄 uygavazifa7.java: Elektromobil parametrlari
Kiritilgan songa muvofiq elektromobil zaryadi, kilometri yoki maydonini hisoblaydi.
```java
import java.util.Scanner;

public class uygavazifa7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Parametrni kiriting: ");
        int a = input.nextInt();

        if (a % 10 == 0 && a / 100 == 1) {
            System.out.println("Elektronmobiling kerakli zaryadi");
        } else if (a % 10 == 1 && a / 100 != 0) {
            System.out.println("Elektronmobiling kerakli yurish km");
        } else {
            System.out.println("Elektronmobiling kerakli S");
        }
        input.close();
    }
}
```

### 📄 uygavazifa8.java: Jarima chegirmasi va penya
Jarima to'langan kunga qarab chegirma (3 kungacha 10%) yoki ustama (15 kundan keyin 10%) hisoblaydi.
```java
import java.util.Scanner;

public class uygavazifa8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarima = input.nextInt();
        int kun = input.nextInt();
        double tolov;

        if (kun <= 3) {
            tolov = jarima * 0.9;
        } else if (kun > 15) {
            tolov = jarima * 1.1;
        } else {
            tolov = jarima;
        }
        System.out.println(tolov);
        input.close();
    }
}
```

### 📄 uygavazifa12.java: Harorat va kiyim tavsiyasi
Kiritilgan ob-havo haroratiga qarab qanday kiyinish kerakligini tavsiya etadi.
```java
import java.util.Scanner;

public class uygavazifa12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Haroratni kiriting: ");
        int temp = input.nextInt();

        if (temp < 0) {
            System.out.println("Qalin kiyining, juda sovuq!");
        } else if (temp >= 0 && temp < 20) {
            System.out.println("Issiqroq kiyim kiying.");
        } else {
            System.out.println("Yengil kiyim kiyishingiz mumkin.");
        }
        input.close();
    }
}
```

### 📄 uygavazifa13.java: Uchburchak mavjudligi
Berilgan uchta tomon uzunligi bo'yicha uchburchak yasash mumkinligini tekshiradi (Uchburchak tengsizligi).
```java
import java.util.Scanner;

public class uygavazifa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Uchburchak mavjud");
        } else {
            System.out.println("Uchburchak mavjud emas");
        }
        input.close();
    }
}
```

### 📄 uygavazifa14.java: Oylar va fasllar
Kiritilgan oy raqamiga (1-12) qarab yilning qaysi fasli ekanligini aniqlaydi.
```java
import java.util.Scanner;

public class uygavazifa14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting: ");
        int oy = input.nextInt();

        if (oy == 12 || oy == 1 || oy == 2) {
            System.out.println("Qish fasli");
        } else if (oy >= 3 && oy <= 5) {
            System.out.println("Bahor fasli");
        } else if (oy >= 6 && oy <= 8) {
            System.out.println("Yoz fasli");
        } else if (oy >= 9 && oy <= 11) {
            System.out.println("Kuz fasli");
        } else {
            System.out.println("Noto'g'ri oy raqami!");
        }
        input.close();
    }
}
```

### 📄 uygavazifa15.java: Yosh toifalari
Kiritilgan yoshga qarab foydalanuvchining ijtimoiy toifasini (bola, o'smir, katta) aniqlaydi.
```java
import java.util.Scanner;

public class uygavazifa15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yoshingizni kiriting: ");
        int yosh = input.nextInt();

        if (yosh < 0) {
            System.out.println("Noto'g'ri yosh kiritildi");
        } else if (yosh <= 12) {
            System.out.println("Bola");
        } else if (yosh <= 19) {
            System.out.println("O'smir");
        } else {
            System.out.println("Katta yoshli shaxs");
        }
        input.close();
    }
}
```

### 📄 uygavazifa16.java: Juft va toq sonlar
Kiritilgan butun sonning juft yoki toq ekanligini shart operatori orqali hisoblaydi.
```java
import java.util.Scanner;

public class uygavazifa16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        if (son % 2 == 0) {
            System.out.println("Juft son");
        } else {
            System.out.println("Toq son");
        }
        input.close();
    }
}
```

### 📄 uygavazifa17.java: 3 ta sonning eng kattasi
Kiritilgan uchta har xil son ichidan eng kattasini mantiqiy shartlar yordamida ajratib beradi.
```java
import java.util.Scanner;

public class uygavazifa17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x >= y && x >= z) {
            System.out.println("Eng katta son: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Eng katta son: " + y);
        } else {
            System.out.println("Eng katta son: " + z);
        }
        input.close();
    }
}
```

### 📄 uygavazifa18.java: Hafta kunlari
1 dan 7 gacha bo'lgan raqamlarga mos ravishda hafta kunlarini (Dushanba - Yakshanba) ekranga chiqaradi.
```java
import java.util.Scanner;

public class uygavazifa18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hafta kuni raqamini kiriting (1-7): ");
        int kun = input.nextInt();

        if (kun == 1) System.out.println("Dushanba");
        else if (kun == 2) System.out.println("Seshanba");
        else if (kun == 3) System.out.println("Chorshanba");
        else if (kun == 4) System.out.println("Payshanba");
        else if (kun == 5) System.out.println("Juma");
        else if (kun == 6) System.out.println("Shanba");
        else if (kun == 7) System.out.println("Yakshanba");
        else System.out.println("Noto'g'ri kun kiritildi!");
        input.close();
    }
}
```

### 📄 uygavazifa19.java: Musbat, manfiy yoki nol
Kiritilgan sonning ishorasini (musbat, manfiy yoki nol) aniqlab beruvchi dastur.
```java
import java.util.Scanner;

public class uygavazifa19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Musbat son");
        } else if (num < 0) {
            System.out.println("Manfiy son");
        } else {
            System.out.println("Kiritilgan son nolga teng");
        }
        input.close();
    }
}
```

### 📄 uygavazifa20.java: Kabisa yili (Kengaytirilgan)
Kiritilgan yilning xususiyatlarini tekshirib, kalendar tizimidagi holatini aniqlaydi.
```java
import java.util.Scanner;

public class uygavazifa20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yilni tekshirish uchun kiriting: ");
        int y = input.nextInt();

        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("Kabisa yili");
        } else {
            System.out.println("Oddiy yil");
        }
        input.close();
    }
}
```
