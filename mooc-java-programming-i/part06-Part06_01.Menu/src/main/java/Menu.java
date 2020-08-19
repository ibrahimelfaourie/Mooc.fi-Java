
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }


    public void addMeal(String meal) {
        if (!meals.contains(meal)){
            meals.add(meal);
        }

    }
    //adds a meal to the menu. If the meal is already on the list, it should not be added again.
    public void printMeals() {
        for (int i = 0; i<meals.size(); i++){
            System.out.println(meals.get(i));
        }
    }
    //prints the meals.
    public void clearMenu(){
        meals.clear();
    }
    //clears the menu.

    // implement the required methods here
}
