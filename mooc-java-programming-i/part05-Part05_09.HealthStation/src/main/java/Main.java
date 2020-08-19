
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions

        HealthStation hs = new HealthStation();
        Person sandra = new Person("Sandra", 30,170,65);

        hs.weigh(sandra);
        hs.feed(sandra);
        System.out.println(sandra.getWeight());
        System.out.println(hs.weighings());



    }
}
