package bad.step01;

public abstract class Beverage {
    protected String description = "this is beverage abstract field.";

    protected String getDescription() {
        return this.description;
    }

    protected abstract long getCost();
}
