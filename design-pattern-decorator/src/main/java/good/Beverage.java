package good;

public abstract class Beverage {

    protected String description = "";

    protected String getDescription() {
        return this.description;
    }

    protected abstract long getCost();
}
