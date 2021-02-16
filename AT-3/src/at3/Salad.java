package at3;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private ArrayList<Vegetable> ingredients;

    Salad() {
        ingredients = new ArrayList<Vegetable>();
    }

    public Salad add(Vegetable v) {
        ingredients.add(v);
        return this; //for chaining
    }

    public Salad remove(Vegetable v) {
        ingredients.remove(v);
        return this;
    }

    public int countIngredients() {
        return ingredients.size();
    }

    public Vegetable getIngredientByIndex(int index) {
        return ingredients.get(index);
    }

    public void printIngredients() {

        for (Vegetable curVal : ingredients) {
            System.out.println(curVal.toString());
        }
    }

    public void sortByWeight(boolean order) {
        if(ingredients.size() > 0) {
            if(order) {
                Collections.sort(ingredients, Vegetable.vegWeightComparatorAsc);

            } else {
                Collections.sort(ingredients, Vegetable.vegWeightComparatorDesc);
            }
            printIngredients();
        }
    }

    public void sortByCalories(boolean order) {
        if(ingredients.size() > 0) {
            if(order) {
                Collections.sort(ingredients, Vegetable.vegCalsComparatorAsc);

            } else {
                Collections.sort(ingredients, Vegetable.vegCalsComparatorDesc);
            }
            printIngredients();
        }
    }

}
