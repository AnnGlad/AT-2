package at3;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private final ArrayList<Vegetable> ingredients;

    Salad() {
        ingredients = new ArrayList<>();
    }

    public boolean isEmpty() {
        if(ingredients.size() > 0) {
            return false;
        } else {
            return  true;
        }
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

    public ArrayList<Vegetable> findIngredientsByColor(String color) {
        ArrayList<Vegetable> sameColorIngredients = new ArrayList<>();
        for (Vegetable curVal : ingredients) {
            if (curVal.getColor().equalsIgnoreCase(color)) {
                sameColorIngredients.add(curVal);
            }
        }
        return sameColorIngredients;
    }

    public ArrayList<Vegetable> findIngredientsWithinRange(int val1, int val2) {
        ArrayList<Vegetable> ingredientsInRange = new ArrayList<>();
        for (Vegetable curVal : ingredients) {
            if (curVal.getWeight() >= val1 && curVal.getWeight() <= val2) {
                ingredientsInRange.add(curVal);
            }
        }
        return ingredientsInRange;
    }

    public void sortByWeight(SortingOrder order) {
        if (order == SortingOrder.ASC) {
            Collections.sort(ingredients, Vegetable.vegWeightComparatorAsc);

        } else {
            Collections.sort(ingredients, Vegetable.vegWeightComparatorDesc);
        }
        printIngredients();
    }

    public void sortByCalories(SortingOrder order) {
        if (order == SortingOrder.ASC) {
            Collections.sort(ingredients, Vegetable.vegCalsComparatorAsc);

        } else {
            Collections.sort(ingredients, Vegetable.vegCalsComparatorDesc);
        }
        printIngredients();
    }

}
