package at2;

public class Demo {

    public static void main(String[] args) {
        String taskDescription = """
                ===\s
                Task description:\s
                Create classes of Men and Women that have common characteristics (e.g. height, weight, hair color, etc.).\s
                Limit access to variables from outside - implement special getters and setters for access.
                Define for each class which characteristics may belong to the class and which may belong to the class object.\s
                Define for each class which behavior is belonging to the class and which to the object. Implement the logic outlined above for each class.
                Create a demo class to display the results of creating objects on the screen.\s
                ===""";
        
        System.out.println(taskDescription);
        Woman women1 = new Woman("Alexa", 26, 164, 50, "silver");
        System.out.println(women1.getName() + " is a " + women1.getGender());
        women1.printInfo();

        Man man1 = new Man("Jae", 30, 190, 90, "brown");
        man1.printInfo();
        man1.setHeight(192);
        System.out.println("His height is: " + man1.getHeight());
        man1.beardInfo();

        Man man2 = new Man();
        man2.setName("Pavel");
        man2.setAge(15);
        man2.setHairColor("yellow");
        man2.printInfo();
        man2.beardInfo();

        Human.makeChild(man1, women1);

    }
}
