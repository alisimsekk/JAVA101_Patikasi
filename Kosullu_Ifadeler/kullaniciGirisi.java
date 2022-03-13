package Kosullu_Ifadeler;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String userName, password1, password2;
        int passCntrl, secim;

        System.out.print("Kullanıcı Adını Girinizi : ");
        userName = input.nextLine();

        System.out.print("Şifre Giriniz : ");
        password1 = input.nextLine();
        passCntrl = (password1.equals("java123")) ? 1 : 0;

        if (userName.equals("patika") && password1.equals("java123")){
            System.out.println("Başarılı Giriş Yaptınız!");
        }    
        else {
            System.out.println("Hatalı Giriş Yaptınız!");
        

            if(passCntrl==0){
                System.out.println("Şifreniz hatalı!\nŞimdi sıfırlamak için 1'e,\nDaha sonra sıfırlamak için 2'ye basınız.");
                secim = input.nextInt();

                if(secim==1){
                    System.out.print("Yeni Şifrenizi Giriniz :");
                    Scanner inp = new Scanner(System.in);
                    password2 = inp.nextLine();
                    
                    if( (password2.equals(password2)) || (password2.equals("java123")) ){
                        System.out.println("Şifre oluşturulamadı, lütfen daha sonra tekrar deneyiniz" );

                    }
                    else{
                        System.out.println("Şifre oluşturuldu");
                    }
                }
                else{
                    System.out.println("iyi günler ");
                }
            }
            else{
                System.out.println("Kullanıcı adınız hatalı, tekrar giriş yapınız!");
            }
        }
           
    }
}
