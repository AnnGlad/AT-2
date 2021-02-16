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

    public static void sortingByWeight(Salad s, boolean order) {
        System.out.println("Ingredients sorted by weight:");
        s.sortByWeight(order);
    }

    public static void sortingByCals(Salad s, boolean order) {
        System.out.println("Ingredients sorted by calories:");
        s.sortByCalories(order);
    }

    public static double calcCals(Salad s) {
        System.out.println("Sum of calories in your salad: " + sumCalories(s));
        return sumCalories(s);
    }

}
