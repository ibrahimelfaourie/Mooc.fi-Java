import java.util.ArrayList;

public class Stack {

    ArrayList<String> list;


    public Stack(){

        this.list = new ArrayList<>();

    }

    public boolean isEmpty() {
        if(list.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void add(String value){
        list.add(value);
    }
    public ArrayList<String> values(){
        return list;
    }
    public String take(){
        String lastindex = list.get(list.size()-1);
        list.remove(list.size()-1);
        return lastindex;

    }



}
