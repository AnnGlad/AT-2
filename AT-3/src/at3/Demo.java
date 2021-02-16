package at3;

public class Demo {

    public static void main(String[] args) {

        Tomato t1 = new Tomato(220);
        Tomato t2 = new Tomato(100);
        Cucumber c1 = new Cucumber(100);
        Broccoli b1 = new Broccoli(400.5);
        Salad s1  = new Salad();

        Chef.addToSalad(s1, t1, t2, c1, b1);
        Chef.removeFromSalad(s1, t1);
        Chef.printSaladIngredients(s1);
        Chef.calcCals(s1);
        Chef.sortingByWeight(s1, false);
        System.out.println("===");
        Chef.sortingByCals(s1, false);
        Chef.sortingByCals(s1, true);
        Chef.CompareTwoVegetables(c1, t2);
    }
}
