package at3;

public class CaloriesCalculator {

    public static double sumCalories(Salad s) {
        double sumCalories = 0;
        if(s.countIngredients()>0) {
            for (int i =0; i < s.countIngredients(); i++) {
                sumCalories += s.getIngredientByIndex(i).calcCalories();
            }
        }
        return sumCalories;
    }

}
