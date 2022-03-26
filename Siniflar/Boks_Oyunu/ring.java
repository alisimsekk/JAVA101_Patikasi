package Siniflar.Boks_Oyunu;

public class Ring {
    Fighter b1;
    Fighter b2;
    int minWeight;
    int maxWeight;
    double randVal =  Math.random() * 100;
    public Ring(Fighter b1, Fighter b2, int minWeight, int maxWeight){
        
        if(randVal<50){
            this.b1 = b1;
            this.b2 = b2;
        }
        else{
            this.b1 = b2;
            this.b2 = b1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(checkWeight()){
            int i =0;
            while(b1.health > 0 && b2.health > 0){
                i++;
                System.out.println("--------" + i + " . ROUND --------");
                b2.health = b1.hit(b2);
                if(isWin()){
                    break;
                }
                b1.health = b2.hit(b1);
                if(isWin()){
                    break;
                }

                printscore();
            }   
        }
        else    {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }

    }

    public boolean checkWeight() {
        return (b1.weight >= minWeight && b1.weight <= maxWeight) && (b2.weight >= minWeight && b2.weight <= maxWeight);
    }
    
    public boolean isWin(){
        if (b1.health == 0){
            System.out.println("Maçı kazanan : " + b2.name);
            return true;
        }
        else if (b2.health == 0){
            System.out.println("Maçı kazanan : " + b1.name);
            return true;
        }

        return false;
    }

    public void printscore(){
        System.out.println("------------");
        System.out.println(b1.name + " Kalan Can :" + b1.health);
        System.out.println(b2.name + " Kalan Can :" + b2.health);
    }
}
