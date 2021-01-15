package good;

public enum BusType {

    EXPRESS(30000, 30),
    INTER_CITY(20000, 20);

    private final int cost;
    private final int seatCount;

    BusType(final int cost, final int seatCount) {
        this.cost = cost;
        this.seatCount = seatCount;
    }

    public int getCost() {
        return cost;
    }

    public int getSeatCount() {
        return seatCount;
    }
}
