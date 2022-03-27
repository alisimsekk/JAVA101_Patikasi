package Diziler;

public class harmonikOrtalamaHesaplama {
    public static void main(String [] args){
        int [] dizi = {1, 2, 3, 4, 5};
        double toplam=0.0;
        double ortalama;

        for(int i =0 ; i< dizi.length; i++){
            toplam += 1.0/dizi[i];
        }
        
        ortalama = dizi.length/toplam;
        System.out.println("harmonik ortalama : "+ ortalama);

    }
} //www.patika.dev
