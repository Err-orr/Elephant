public class Elephant {
    // Instance variables right here
    private int age;
    private double weight;
    private String name;
    // Constructors right here
    public Elephant() {
        age = 0;
        weight = 0.0;
        name = "Default";
    }
    public Elephant(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    // Methods right here
    public double loseWeight() {
        weight -= age * 0.25;
        return weight;
    }
    public double loseWeight(double weightLost) {
        weight -= weightLost;
        return weight;
    }
    public void talkingElephant() {
        System.out.println("The " + name + "'s age is " + age + " and weighs " + weight);
    }
    public void haveBirthday() {
        age += 1;
        System.out.println("Happy " + age + " birthday, " + name + "!");
    }
    public int getAge() {
        return age;
    }
    public int setAge(int age) {
        this.age = age;
        return this.age;
    }
}