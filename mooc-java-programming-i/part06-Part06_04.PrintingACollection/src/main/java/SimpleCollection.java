
import java.lang.reflect.Array;
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

    public String toString() {

        String e = "";
        for (int i = 0; i < elements.size(); i++){
            if (i ==elements.size()-1){
                e = e + elements.get(i);
            }else {
                e = e + elements.get(i) + "\n";
            }
        }

        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }else if (elements.size()<2){
            return "The collection " + name + " has " + elements.size() + " element:\n" + e;
        }else{
            return  "The collection " + name + " has " + elements.size() + " elements:\n" + e;
        }






    }
    
}
