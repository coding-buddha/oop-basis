package bad.step01;

public class DarkRoastWithWhipandSoy extends Beverage{

    public DarkRoastWithWhipandSoy() {
        this.description = "this is best dark-roast with whipand soy";
    }

    protected String getDescription() {
        return this.description;
    }

    @Override
    protected long getCost() {
        return 900L;
    }
}
