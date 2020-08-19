import java.util.ArrayList;

public class Package {

   private ArrayList<Gift> gifts ;

    public Package(){
    gifts = new ArrayList<>();

    }

    public void addGift(Gift gift){
        gifts.add(gift);

    }
    public int totalWeight(){
        int totWeight = 0;
        for (int i = 0; i < gifts.size(); i++){
            totWeight = totWeight + gifts.get(i).getWeight();
        }
        return totWeight;
    }
}
