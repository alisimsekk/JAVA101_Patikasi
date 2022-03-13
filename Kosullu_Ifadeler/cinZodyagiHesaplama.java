package Kosullu_Ifadeler;
import java.util.Scanner;
public class cinZodyagiHesaplama {
    public static void main(String[] args){
        int yil, mod12;
        String zodyak = " ";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = input.nextInt();

        mod12 = yil%12;

        switch(mod12){
            
            case 0 :
            zodyak = "Maymun";
            break;

            case 1 :
            zodyak = "Horoz";
            break;

            case 2 :
            zodyak = "Köpek";
            break;

            case 3 :
            zodyak = "Domuz";
            break;

            case 4 :
            zodyak = "Fare";
            break;

            case 5 :
            zodyak = "Öküz";
            break;

            case 6 :
            zodyak = "Kaplan";
            break;

            case 7 :
            zodyak = "Tavşan";
            break;

            case 8 :
            zodyak = "Ejderha";
            break;

            case 9 :
            zodyak = "Yılan";
            break;

            case 10 :
            zodyak = "At";
            break;

            case 11 :
            zodyak = "Koyun";
            break;
         
        }

        if(zodyak.equals(" ")){
            System.out.println("Hatalı Giriş Yaptınız");
        }

        else{
        System.out.println("Çin Zodyağı Burcunuz : " + zodyak);
        }

    }
}
