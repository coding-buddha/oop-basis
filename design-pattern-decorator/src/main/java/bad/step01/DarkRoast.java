package bad.step01;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "this is best dark-roast";
    }

    protected String getDescription() {
        return this.description;
    }

    @Override
    protected long getCost() {
        return 300L;
    }
}
