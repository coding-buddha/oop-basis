package bad.step01;

public class DarkRoastWithSteamedMilk extends Beverage {

    public DarkRoastWithSteamedMilk() {
        this.description = "this is best dark-roast with steamed milk";
    }

    protected String getDescription() {
        return this.description;
    }

    @Override
    protected long getCost() {
        return 1100L;
    }
}
