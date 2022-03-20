package Metodlar;
import java.util.Scanner;

public class gelismisHesapMakinesi {

    static void plus(){
        Scanner input = new Scanner(System.in);
        int a, result=0, karar=1;

        for(int i=1;i>0;i++){
            if (karar==1){
                System.out.print("toplama işlemi yapacağınız " + i + ". sayıyı giriniz : ");
                a = input.nextInt();
                result +=a;
                System.out.println("Sonuc : " + result);
                System.out.print("Yeni sayı girmek için 1 e, çıkmak için 0 a basınız : ");
                karar = input.nextInt();   
                while(karar != 0 && karar != 1){
                    System.out.print("Hatalı giriş yaptınız. Lütfen 1 ya da 0 a basınız : ");
                    karar = input.nextInt();
                }
            }
            else if(karar==0){
                break;
            }
        }
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        int a, result=0, karar=1;

        for(int i=1;i>0;i++){
            if (karar==1){
                System.out.print("Çıkarma işlemi yapacağınız " + i + ". sayıyı giriniz : ");
                a = input.nextInt();
                if(i==1){
                    result=a;
                }
                else{
                    result -=a;
                }
                System.out.println("Sonuc : " + result);
                System.out.print("Yeni sayı girmek için 1 e, çıkmak için 0 a basınız : ");
                karar = input.nextInt();
                while(karar != 0 && karar != 1){
                    System.out.print("Hatalı giriş yaptınız. Lütfen 1 ya da 0 a basınız : ");
                    karar = input.nextInt();
                }
            }
            else if(karar==0){
                break;
            }
        } 
    }

    static void times(){
        Scanner input = new Scanner(System.in);
        int a, result=1, karar=1;

        for(int i=1;i>0;i++){
            if (karar==1){
                System.out.print("Çarpma işlemi yapacağınız " + i + ". sayıyı giriniz : ");
                a = input.nextInt();
                if(a==0){
                    System.out.println("Çarpanlardan birinin sıfır olması her zaman sıfır sonucunu verir.");
                    System.out.print("Tekrar çarpma işlemi yapmak için 1 e, çıkmak için 0 a basınız : ");
                    karar = input.nextInt();
                    i=0;
                }
                else{
                    result *=a;
                    System.out.println("Sonuc : " + result);
                    System.out.print("Yeni sayı girmek için 1 e, çıkmak için 0 a basınız : ");
                    karar = input.nextInt();   
                    while(karar != 0 && karar != 1){
                        System.out.print("Hatalı giriş yaptınız. Lütfen 1 ya da 0 a basınız : ");
                        karar = input.nextInt();
                    }
                }
            }
            else if(karar==0){
                break;
            }
        }
    }

    static void divide(){
        Scanner input = new Scanner(System.in);
        int a, karar=1;
        double result=1.0;

        for(int i=1;i>0;i++){
            if (karar==1){
                System.out.print("Bölme işlemi yapacağınız " + i + ". sayıyı giriniz : ");
                a = input.nextInt();
                if(i==1 && a==0){
                    System.out.println("Sıfırın herhangi bir sayıya bölümü her zaman sıfır sonucunu verir.");
                    System.out.print("Tekrar bölme işlemi yapmak için 1 e, çıkmak için 0 a basınız : ");
                    karar = input.nextInt();
                    i=0;
                }
                else if(i !=1 && a==0){
                    System.out.println("Herhangi bir sayının sıfıra bölümü tanımsızdır.");
                    System.out.print("Tekrar bölme işlemi yapmak için 1 e, çıkmak için 0 a basınız : ");
                    karar = input.nextInt();
                    i=0;
                }
                else if(i==1 && a!=0){
                    result=a;
                    System.out.println("Sonuc : " + result);
                    System.out.print("Yeni sayı girmek için 1 e, çıkmak için 0 a basınız : ");
                    karar = input.nextInt();   
                    while(karar != 0 && karar != 1){
                        System.out.print("Hatalı giriş yaptınız. Lütfen 1 ya da 0 a basınız : ");
                        karar = input.nextInt();
                    }
                }
                else{
                    result /=a;
                    System.out.println("Sonuc : " + result);
                    System.out.print("Yeni sayı girmek için 1 e, çıkmak için 0 a basınız : ");
                    karar = input.nextInt();   
                    while(karar != 0 && karar != 1){
                        System.out.print("Hatalı giriş yaptınız. Lütfen 1 ya da 0 a basınız : ");
                        karar = input.nextInt();
                    }
                }
            }
            else if(karar==0){
                break;
            }
        }
    }

    static void pow(){
        Scanner input = new Scanner(System.in);
        int a, b, result=1;

        System.out.print("Taban sayısını giriniz : ");
        a = input.nextInt();

        System.out.print("Üs sayısını giriniz : ");
        b = input.nextInt();

        for(int i=1;i<=b;i++){
            result *=a;
        }
        System.out.println("sonuç : " + result);
    }

    static void fac(){
        Scanner input = new Scanner(System.in);
        int a, result=1;

        System.out.print("Lütfen bir sayı giriniz : ");
        a = input.nextInt();

        for(int i=1;i<=a;i++){
            result *=i;
        }
        System.out.println("sonuç : " + result);
    }
    
    static int mod(){
        Scanner input = new Scanner(System.in);
        int a, b, result=1;

        System.out.print("1. sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        b = input.nextInt();
        if(b==0){
            System.out.println("2. sayı sıfır olamaz.");
            return mod();
        }

        result = a%b;
        System.out.println("sonuç : " + result);
        return result;
    }

    static void areaCircum(){
        Scanner input = new Scanner(System.in);
        int a, b, area=0, circumference=0;

        System.out.print("Dikdörtgenin kısa kenerını giriniz : ");
        a = input.nextInt();

        System.out.print("Dikdörtgenin uzun kenerını giriniz : ");
        b = input.nextInt();

        if(a>0 && b>0){
            area = a*b;
            circumference = 2*(a+b);
            System.out.println("Dikdörtgenin alanı : " + area + "\nDikdörtgenin çevresi : " + circumference);
        }
        else{
            System.out.println("Hatalı değer girdiniz. Tekrar giriş yapınız.");
            areaCircum();
        }
    }
        

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";
        
        do{
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            select = input.nextInt();

            switch(select){
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;

                case 3:
                    times();
                    break;

                case 4:
                    divide();
                    break;
                    
                case 5:
                    pow();
                    break;

                case 6:
                    fac();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    areaCircum();
                    break;
                
                case 0:
                break;

                default:
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }while(select != 0);
        
    }
    
} // www.patika.dev