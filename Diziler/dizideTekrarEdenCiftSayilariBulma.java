package Diziler;

import java.util.Arrays;

public class dizideTekrarEdenCiftSayilariBulma {
    static boolean isFind (int [] arr, int sayi){
        for(int i =0; i<arr.length;i++){
            if(arr[i] == sayi){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int [] dizi = {4, 7, 4, 4, 3, 8, 10, 10, 21, 1, 33, 8};
        int [] dublicate = new int [(dizi.length)];
        int startIndex =0;

        for(int i =0; i< dizi.length; i++){
            for(int j=0; j< dizi.length; j++){
                if((i!=j) && (dizi[i] == dizi[j])){
                    if(dizi[j]%2==0){
                        if(!isFind(dublicate, dizi[j])){
                            dublicate[startIndex++] = dizi[j];
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(dublicate));
    }
    
} // www.patika.dev 
