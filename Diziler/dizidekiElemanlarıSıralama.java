package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class dizidekiElemanlarıSıralama {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        int [] dizi = new int [n]; 
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i=0; i<n; i++){
            System.out.print((i+1) + " . Elemanı : ");
            dizi[i] = input.nextInt();
        }
    
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    } 
    
}
