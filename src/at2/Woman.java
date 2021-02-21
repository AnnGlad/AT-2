package at2;

public class Woman extends Human {
    Woman() {}

    Woman(String name, int age, double height, double weight, String hairColor) {
        super(name, age, height, weight, hairColor, "female");
    }

    public void printInfo() {
        System.out.println("This woman's name is " + getName() + ". She is " + getAge());
    }

}
