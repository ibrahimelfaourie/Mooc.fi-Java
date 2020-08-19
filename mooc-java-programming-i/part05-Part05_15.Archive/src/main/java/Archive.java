public class Archive {

    private String id;
    private String name;




    public Archive(String i, String n){

        this.id = i;
        this.name = n;

    }

    public String toString(){
        return id + ": " + name;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
