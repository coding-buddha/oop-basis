package good;

/**
 * 시외버스
 */
public class IntercityBus implements Bus {

    @Override
    public int getCost() {
        return BusType.INTER_CITY.getCost();
    }

    @Override
    public int getSeatCount() {
        return BusType.INTER_CITY.getSeatCount();
    }

    @Override
    public BusType getType() {
        return BusType.INTER_CITY;
    }
}
