package at2;

public class Man extends Human {
    Man() {}

    Man(String name, int age, double height, double weight, String hairColor) {
        super(name, age, height, weight, hairColor, "male");
    }

    public void printInfo() {
        System.out.println("This man's name is " + getName() + ". He is " + getAge());
    }

    public void beardInfo() {
        boolean beard = getAge() > 16;
        if (beard) {
            System.out.println(getName() + " has " + getHairColor() + " beard");
        } else {
            System.out.println(getName() + " does not have a beard");
        }
    }
}
