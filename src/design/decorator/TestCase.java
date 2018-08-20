package design.decorator;

public class TestCase {

    public static void main(String[] args) {

        MonkeyKing mk = new MonkeyKing();
        mk.fly();

        Fish fish = new Fish(mk);
        fish.fly();

    }

}
