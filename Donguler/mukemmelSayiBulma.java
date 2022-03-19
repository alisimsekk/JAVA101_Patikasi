package Donguler;
import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class mukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int toplam=0;

        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        for(int i=1;i<num;i++){
            if(num%i==0){
                toplam+=i;
            }
        }
        if(toplam==num){
            System.out.println(num + " mükemmel sayıdır.");
        }
        else{
            System.out.println(num + " mükemmel sayı değildir.");
        }
    }
    
}
