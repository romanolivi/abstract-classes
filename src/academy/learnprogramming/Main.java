package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dog teddy = new Dog("Teddy");
        teddy.breathe();
        teddy.eat();

        Parrot parrot = new Parrot("Raven");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin ky = new Penguin("Ky");
        ky.fly();

    }
}
