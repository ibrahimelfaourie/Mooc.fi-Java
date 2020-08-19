public class Cube {

private int edgeLenght;

    public Cube(int edgeLength){
        this.edgeLenght = edgeLength;
    }

    public int volume(){
        int volume = edgeLenght*edgeLenght*edgeLenght;
        return volume;
    }

    public String toString(){
        return "The length of the edge is "+ edgeLenght +" and the volume " + volume();
    }
}
