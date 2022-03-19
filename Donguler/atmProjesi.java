package Donguler;
import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int bakiye=1500, tutar;
        int secim;
        int hak=3;
        
        do{
            System.out.print("Kullanıcı Adınızı Giriniz :");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifresinizi Giriniz :");
            sifre = input.nextLine();
                if (kullaniciAdi.equals("patika") && sifre.equals("dev123")){
                    System.out.println("Başarılı Giriş Yaptınız. Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println();
                    hak=0;
                    do{
                        System.out.println("1- Para Yatırma\n" + 
                                            "2- Para Çekme\n" + 
                                            "3- Bakiye Sorgulama\n" + 
                                            "4- Çıkış Yap");
                        System.out.print("Lütten Yapmak İstediğiniz İşlemi Seçiniz :");
                        secim = input.nextInt();
                        switch(secim){
                            case 1:
                                System.out.print("Yatırılacak Tutarı Giriniz : ");
                                tutar = input.nextInt();
                                bakiye +=tutar;
                                System.out.println("İşlem Başarılı.Hesabınızdaki Güncel Bakiye : "+ bakiye);
                                System.out.println();
                            break;
                            
                            case 2:
                                System.out.print("Çekilece Tutarı Giriniz : ");
                                tutar = input.nextInt();
                                if(tutar<bakiye){
                                bakiye -=tutar;
                                System.out.println("İşlem Başarılı.Hesabınızdaki Güncel Bakiye : "+ bakiye);
                                System.out.println();
                                }
                                else{
                                    System.out.println("Hesabınızdaki Bakiye Bu İşlem İçin Yetersiz.");
                                }
                            break;

                            case 3:
                                System.out.println("Bakineyiz : " + bakiye);
                                System.out.println();
                                break;
                            
                            case 4:
                                System.out.println("Tekrar Görüşmek Üzere.");
                        }
                    }while(secim != 4);
                }
                else{
                    hak--;
                    System.out.println("Kullanıcı Adı veya Şifreniz Hatalı. Lütfen Tekrar Deneyiniz.");
                    System.out.println("Kalan Hakkınız :" + hak);
                    if(hak==0){
                        System.out.println("Hesabınız Bloke Olmuştur. Lütfen Bankanız ile İletişime Geçinizi.");
                    }
                }
        }while(hak>0);
        

    }
}
