package Donguler;

import java.util.Scanner;

public class tersUcgenYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int step;
        
        System.out.print("Basamak sayısını giriniz : ");
        step = input.nextInt();

        for(int i=step;i>0;i--){
            for(int k=0;k<(step-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
            }
            
            
            System.out.println();
        }
        
    }
    
}
