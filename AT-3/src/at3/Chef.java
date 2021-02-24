package at3;

import static at3.CaloriesCalculator.sumCalories;

public class Chef {

    public static void addToSalad(Salad s, Vegetable ... v) {
        for (var curVal : v) {
            s.add(curVal);
        }
        System.out.println("+ Added " + v.length + " items(s) to the salad");
    }

    public static void removeFromSalad(Salad s, Vegetable ... v) {
        for (var curVal : v) {
            s.remove(curVal);
        }
        System.out.println("- Removed " + v.length + " items(s) from the salad");
    }
    public static void printSaladIngredients(Salad s) {
        System.out.println("Here is your salad ingredients:");
        s.printIngredients();
    }

    public static void sortingByWeight(Salad s, SortingOrder order) {
        String sortedBy = order == SortingOrder.ASC ? "ascending" : "descending";
        System.out.println("Ingredients sorted by weight in " + sortedBy + " order:");
        s.sortByWeight(order);
    }

    public static void sortingByCals(Salad s, SortingOrder order) {
        String sortedBy = order == SortingOrder.ASC ? "ascending" : "descending";
        System.out.println("Ingredients sorted by calories in " + sortedBy + " order:");
        s.sortByCalories(order);
    }

    public static void calcCals(Salad s) {
        System.out.println("Sum of calories in your salad: " + sumCalories(s));
    }

    public static void compareTwoVegetables(Vegetable v1, Vegetable v2) {
        if(v1.equals(v2)) {
            System.out.println("Vegetables " + v1.toString() + " and " + v2.toString() +" are the same");
        } else {
            System.out.println("Vegetables " + v1.toString() + " and " + v2.toString() +" are not equal");
        }
    }

    public static void showIngredientsByColor(Salad s, String color) {
        if(!s.findIngredientsByColor(color).isEmpty()) {
            System.out.println("These vegetables are " + color + ":");
            for (Vegetable carVal : s.findIngredientsByColor(color)) {
                System.out.println(carVal.toString());
            }
        } else {
            System.out.println("Sorry, we can not find vegetables with " + color + " color in the salad");
        }
    }

    public static void showIngredientsWithinRange(Salad s, int val1, int val2) {
        if(!s.findIngredientsWithinRange(val1, val2).isEmpty()) {
            System.out.println("These vegetables are within weight range from " + val1 + " to " + val2 + ":");
            for (Vegetable carVal : s.findIngredientsWithinRange(val1, val2)) {
                System.out.println(carVal.toString());
            }
        } else {
            System.out.println("Sorry, we can not find vegetables within weight range from " + val1 + " to " + val2);
        }
    }

}
