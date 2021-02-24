package at3;

import java.util.Comparator;
import java.util.Objects;

public class Vegetable {
    private String name;
    private String color;
    private double weight;
    private double energyDensity; //kcal/100g

    Vegetable(String name, String color, double weight, double energyDensity) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.energyDensity = energyDensity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getEnergyDensity() {
        return energyDensity;
    }

    public double calcCalories() {
        return (energyDensity * weight) / 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            return this.getWeight() == vegetable.getWeight() && this.getName() == vegetable.getName() && this.getColor() == vegetable.getColor();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight, energyDensity);
    }

    public static Comparator<Vegetable> vegWeightComparatorAsc = new Comparator<Vegetable>() {
        public int compare(Vegetable v1, Vegetable v2) {
            int weight1 = (int) v1.getWeight();
            int weight2 = (int) v2.getWeight();
            return weight1 - weight2;
        }
    };

    public static Comparator<Vegetable> vegWeightComparatorDesc = new Comparator<Vegetable>() {
        public int compare(Vegetable v1, Vegetable v2) {
            int weight1 = (int) v1.getWeight();
            int weight2 = (int) v2.getWeight();
            return weight2 - weight1;
        }
    };

    public static Comparator<Vegetable> vegCalsComparatorDesc = new Comparator<Vegetable>() {
        public int compare(Vegetable v1, Vegetable v2) {
            int cals1 = (int) v1.calcCalories();
            int cals2 = (int) v2.calcCalories();
            return cals2 - cals1;
        }
    };

    public static Comparator<Vegetable> vegCalsComparatorAsc = new Comparator<Vegetable>() {
        public int compare(Vegetable v1, Vegetable v2) {
            int cals1 = (int) v1.calcCalories();
            int cals2 = (int) v2.calcCalories();
            return cals1 - cals2;
        }
    };

    @Override
    public String toString() {
        return "[name: " + name + ", color: " + color + ", weight: " + weight + ", calories: " + calcCalories() + "]";
    }
}

