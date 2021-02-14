package at2;

public abstract class Human {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String hairColor;

    Human() {}

    Human(String name, int age, double height, double weight, String hairColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
    }

    abstract String getSex();

    public void printInfo() {
        String pronounce;
        String pronounce2;
        if (getSex() == "female") {
            pronounce = "women";
            pronounce2 = "She";
        } else {
            pronounce = "men";
            pronounce2 = "He";
        }
        System.out.println("This " + pronounce + "'s name is " + name + ". " + pronounce2 + " is " + age);
    }

    public static Human makeChild(Man man, Woman woman) {
        if (man.getAge() >= 18 && woman.getAge() >= 18) {
            int randomSex = (int) (Math.random() * 2);
            double randomWeight = Math.floor(((Math.random() * (4.5 - 2.5)) + 2.5) * 1000) / 1000;
            if (randomSex == 1) {
                return makeBabyGirl(randomWeight);
            } else {
                return makeBabyBoy(randomWeight);
            }
        } else {
            System.out.println("Sorry you both too young");
            return null;
        }
    }

    public static Woman makeBabyGirl(double weight) {
        Woman girl = new Woman();
        girl.setWeight(weight);
        System.out.println("Congratulations, you have a girl " + girl.getWeight() + " kg");
        girl.setAge(0);
        return girl;
    }

    public static Man makeBabyBoy(double weight) {
        Man boy = new Man();
        boy.setWeight(weight);
        boy.setAge(0);
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
