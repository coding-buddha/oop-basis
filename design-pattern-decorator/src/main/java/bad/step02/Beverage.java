package bad.step02;

public abstract class Beverage {

    private boolean steamedMilk;
    private boolean whipandSoy;

    public void setSteamedMilk(boolean steamedMilk) {
        this.steamedMilk = steamedMilk;
    }

    public void setWhipandSoy(boolean whipandSoy) {
        this.whipandSoy = whipandSoy;
    }

    private boolean isSteamedMilk() {
        return steamedMilk;
    }

    private boolean isWhipandSoy() {
        return whipandSoy;
    }

    protected long getCost() {
        long cost = 0;

        if(isSteamedMilk()) {
            cost += 500L;
        }

        if(isWhipandSoy()) {
            cost += 300L;
        }

        return cost;
    }
}
