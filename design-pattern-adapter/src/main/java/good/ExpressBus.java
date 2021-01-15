package good;

/**
 * 고속버스
 */
public class ExpressBus implements Bus{

    @Override
    public int getCost() {
        return BusType.EXPRESS.getCost();
    }

    @Override
    public int getSeatCount() {
        return BusType.EXPRESS.getSeatCount();
    }

    @Override
    public BusType getType() {
        return BusType.EXPRESS;
    }
}
