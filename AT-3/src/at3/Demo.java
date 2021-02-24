package at3;

public class Demo {

    public static void main(String[] args) {

        Tomato tomato1 = new Tomato(220);
        Tomato tomato2 = new Tomato(100);
        Tomato tomato3 = new Tomato(220);
        Cucumber cucumber1 = new Cucumber(100);
        Broccoli broccoli1 = new Broccoli(400);
        Salad salad1  = new Salad();
        Chef.addToSalad(salad1, tomato1, tomato2, cucumber1, broccoli1);
        Chef.removeFromSalad(salad1, tomato1);
        if(!salad1.isEmpty()) {
            Chef.printSaladIngredients(salad1);
            Chef.calcCals(salad1);
            Chef.sortingByWeight(salad1, SortingOrder.DESC);
            Chef.sortingByCals(salad1, SortingOrder.DESC);
            Chef.sortingByCals(salad1, SortingOrder.ASC);
            Chef.compareTwoVegetables(tomato1, tomato3);
            Chef.compareTwoVegetables(broccoli1, cucumber1);
            Chef.showIngredientsByColor(salad1, "green");
            Chef.showIngredientsByColor(salad1, "yellow");
            Chef.showIngredientsWithinRange(salad1,200, 400);
        }

    }

}
