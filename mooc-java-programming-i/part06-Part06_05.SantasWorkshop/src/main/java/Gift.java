

public class Gift {

    private String name;
    private int weight;

    public Gift(String n, int w){
        this.name = n;
        this.weight = w;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }
    public String toString(){
        return name + " (" + weight + ")";
    }

}
