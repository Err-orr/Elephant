public class Main {
    public static void main(String[] args) {
        Elephant leBoin = new Elephant(5, 3000.0, "LeBoin");
        System.out.println(leBoin.loseWeight());
        leBoin.talkingElephant();
        System.out.println("Test birthday method:");
        leBoin.haveBirthday();
        System.out.println("Another test:");
        leBoin.haveBirthday();
        System.out.println(leBoin.setAge(12));
        leBoin.talkingElephant();
        leBoin.loseWeight();
        leBoin.talkingElephant();
    }
}