package design.decorator;

public class Decorator implements Move {

    private MonkeyKing mk;

    public Decorator(MonkeyKing mk) {
        this.mk = mk;
    }

    @Override
    public void fly() {
        mk.fly();
    }
}
