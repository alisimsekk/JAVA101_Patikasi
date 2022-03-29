package Diziler;

public class diziElemanlariFrekansHesaplama {
    static boolean isSame (int [] arr, int sayi){
        for(int i =0; i<arr.length;i++){
            if(arr[i] == sayi){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int [] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int count=1;
        int [] dublicate = new int [dizi.length];
        int startIndex = 0;

        for(int i = 0; i<dizi.length; i++){
            for(int j=0; j<dizi.length; j++){
                if(i!=j && dizi[i]==dizi[j] ){
                    count++;
                }
                
            }
            if (!isSame( dublicate,dizi[i])){
                dublicate[startIndex++] = dizi[i];
                System.out.println(dizi[i] + " sayisi " +  count + " kere tekrar edildi.");
            }
            count=1;
        }
    }
} //www.patika.dev
