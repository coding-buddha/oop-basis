package good;

public class WhipandSoy extends CondimentDecorator {

    private final Beverage beverage;

    public WhipandSoy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected String getDescription() {
        return beverage.getDescription() + " + whipand-soy";
    }

    @Override
    protected long getCost() {
        return 300L + beverage.getCost();
    }
}
