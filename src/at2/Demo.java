package at2;

public class Demo {

    public static void main(String[] args) {

        Woman w1 = new Woman("Alexa", 26, 164,50, "silver");
        System.out.println(w1.getName() + " is a " + w1.getSex());
        w1.printInfo();

        Man m1 = new Man("Jae", 30, 190, 90, "brown");
        m1.printInfo();
        System.out.println(m1.getHeight());

        Man m2 = new Man();
        m2.setName("Pavel");
        m2.setAge(18);
        m2.setHairColor("yellow");
        m2.printInfo();
        m2.setBeard(true);
        m2.beardInfo();

        Human child = Human.makeChild(m1, w1);
        if (child != null) {
            System.out.println(child.getSex());
            System.out.println(child.getWeight());
            if(child.getSex() == "male") {
                child.setName("Brian");
            } else {
                child.setName("Maria");
            }
            child.printInfo();
        }
    }
}
