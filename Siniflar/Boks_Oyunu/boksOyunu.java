package Siniflar.Boks_Oyunu;

public class boksOyunu {
    public static void main (String [] args){
        fighter Ahmet = new fighter("Ahmet" , 15, 100, 90, 25);
        fighter Mehmet = new fighter("Mehmet" , 10 , 95, 100, 45);
        
        ring r = new ring( Ahmet, Mehmet, 90 , 100);
        r.run();
    }
}
// www.patika.dev