package Kosullu_Ifadeler;

import java.util.Scanner;

public class sinifGecmeHesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, turk, muz, i=0;
        double ort;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if(0<= mat && mat <= 100){
            i+=1;
        }
        else{
            mat=0;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();
        if(0<= fiz && fiz<= 100){
            i++;
        }
        else{
            fiz=0;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kim = input.nextInt();
        if(0<= kim && kim<= 100){
            i++;
        }
        else{
            kim=0;
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turk = input.nextInt();
        if(0<= turk && turk <= 100){
            i++;
        }
        else{
            turk=0;
        }

        System.out.print("Müzik notunuzu giriniz : ");
        muz = input.nextInt();
        if(0<= muz && muz <= 100){
            i++;
        }
        else{
            muz=0;
        }

        ort = (mat+fiz+turk+muz+kim)/i;

        if(ort>=55){
            System.out.println("Tebrikler sınıfı geçtiniz !");
        }
        else{
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
        }

        System.out.println("Not ortalamanız : " + ort);

    }
}
