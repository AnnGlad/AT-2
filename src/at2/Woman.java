package at2;

public class Woman extends Human {

    Woman(){};
    Woman(String name, int age, double height, double weight, String hairColor) {
        super(name, age, height, weight, hairColor);
    }

    public String getSex() {
        return "female";
    }
}
