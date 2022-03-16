package Donguler;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class kombinasyonHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sonuc1=1, sonuc2=1, sonuc3=1, r=0, n=0, j=1, k=1;

        System.out.print("Kombinasyon hesabı için N değerini giriniz : ");
        n = input.nextInt();

        System.out.print("Kombinasyon hesabı için r değerini giriniz : ");
        r = input.nextInt();

        while(j<=n){
            sonuc1*=j;
            j++;
        }
        
        
        for(int i=1;i<=r;i++){
            sonuc2*=i;
        }

        while(k<=(n-r)){
            sonuc3*=k;
            k++;
        }

        int kombinasyon = sonuc1/(sonuc2*sonuc3);
        System.out.println("Girilen sayıların kombinasyonu :" +kombinasyon );
    } 
}
