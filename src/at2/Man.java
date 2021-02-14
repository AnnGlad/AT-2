package at2;

public class Man extends Human {
    public final String sex = "male";
    private boolean beard;

    Man() {};

    Man(String name, int age, double height, double weight, String hairColor) {
        super(name, age, height, weight, hairColor);
    }

    public String getSex() {
        return "male";
    }

    public void setBeard(boolean beard) {
        beard = getAge() > 16 ? this.beard = beard : false;
    }
    public boolean getBeard() {
        return beard;
    }
    public void beardInfo() {
        if (beard) {
            System.out.println(getName() + " have " + getHairColor() + " beard");
        } else {
            System.out.println(getName() + " does not have a beard");
        }

    }
}
