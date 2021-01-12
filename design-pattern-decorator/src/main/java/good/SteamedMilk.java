package good;

public class SteamedMilk extends CondimentDecorator {

    private final Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected String getDescription() {
        return beverage.getDescription() + " + steamed-milk";
    }

    @Override
    public long getCost() {
        return 500L + beverage.getCost();
    }
}
