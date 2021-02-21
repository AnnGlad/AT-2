package at2;

public abstract class Human {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String hairColor;
    private String gender;

    Human() {}

    Human(String name, int age, double height, double weight, String hairColor, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void printInfo() {}

    public static Human makeChild(Man man, Woman woman) {
        System.out.println("Checking if " + man.getName() + " and " + woman.getName() + " can have a child...");
        if (man.getAge() >= 18 && woman.getAge() >= 18) {
            int randomGender = (int) (Math.random() * 2);
            double randomWeight = Math.floor(((Math.random() * (4.5 - 2.5)) + 2.5) * 1000) / 1000;
            if (randomGender == 1) {
                return makeBabyGirl(randomWeight);
            } else {
                return makeBabyBoy(randomWeight);
            }
        } else {
            System.out.println("Sorry you both are too young");
            return null;
        }
    }

    public static Woman makeBabyGirl(double weight) {
        Woman girl = new Woman();
        girl.setWeight(weight);
        girl.setAge(0);
        girl.setName("Maria");
        System.out.println("Congratulations, you have a girl " + girl.getWeight() + " kg");
        return girl;
    }

    public static Man makeBabyBoy(double weight) {
        Man boy = new Man();
        boy.setWeight(weight);
        boy.setAge(0);
        boy.setName("Brian");
        System.out.println("Congratulations, you have a boy " + boy.getWeight() + " kg");
        return boy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

}
