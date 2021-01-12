package good;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "this is best dark-roast";
    }

    @Override
    protected long getCost() {
        return 600L;
    }
}
