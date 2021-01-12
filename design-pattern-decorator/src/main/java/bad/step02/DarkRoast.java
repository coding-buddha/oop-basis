package bad.step02;

public class DarkRoast extends Beverage {

    private static final long COST = 600L;

    @Override
    public long getCost() {
        return COST + super.getCost();
    }
}
