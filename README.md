# Java Devloper ![If_else](https://img.shields.io/badge/If_else-purple)

## Founder : Rahimjonov Otabek

## #*--------------- [ Home Work ] ------------*#![HomeWork](https://img.shields.io/badge/HomeWork-green)
**`If else bu` `agar bo'lmasam` degani undan `"bank, bankamat va boshqa narsalarda qatib hisob uchun ishlatiladi "` misol uchun >>>
```Java
public class Main{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int a, b;
      System.out.print("Enter Number [1] : ");
      a = sc.nextInt();
      System.out.print("Enter Number [2] : ");
      b = sc.nextInt();
      if ( a <= b) {
          System.out.print("A > B dan Katta:");
      }else {
       System.out.print("A < B dan kichik");
      }
```
## Bu qisqacha tushunganimizni bildirish 
## Endi HomeWorkdi misolari
# ------------------------------------------- #
**Bu yerda Kabsi yilini kiritishni so'rayapmniz**
**Va `Scanner` olyapmiz**
```Java
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Kabsi yilini kiriting : ");
    int n = sc.nextInt();
    if( (n % 4 == 0 && n % 100 != 0) || n % 400 == )){
       System.out.print("Kabsi yili");
    }else {
        System.out.print("Kabsi yili emas: ");
    }
  }
}
