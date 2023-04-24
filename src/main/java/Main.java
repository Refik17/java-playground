public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "Refik");
        Rabbit snowWhite = new Rabbit("Gangy",12, "blue");
        Toy robot = new Toy("Terminator");

        Toy car = new Toy("Lambo");

        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = snowWhite;
        homeFriends[3] = car;


        for (Action friend : homeFriends) {
            friend.play();
    }
}
