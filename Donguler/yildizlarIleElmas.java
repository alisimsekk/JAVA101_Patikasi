package Donguler;
import java.util.Scanner;
public class yildizlarIleElmas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i=1, j=1, k=1;

        System.out.print("bir sayı giriniz:");
        n = input.nextInt();
        
        while (i<=n){
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }
            while(k<=(2*i-1)){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
            j=1;
            k=1;         
        }

        for(i=(n-1);i>0;i--){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}
