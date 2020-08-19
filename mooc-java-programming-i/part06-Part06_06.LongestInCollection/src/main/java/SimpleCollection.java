
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        String longestString = "";
        if (elements.isEmpty()){
            return null;
        }
        for (int i = 0; i<elements.size(); i++){
            if (elements.get(i).length() > longestString.length()){
                longestString  = elements.get(i);
            }
        }
        return longestString;
    }

}
