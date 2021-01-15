package good;

public class BusAdapter implements Car{

    private final Bus bus;

    public BusAdapter(final Bus bus) {
        this.bus = bus;
    }

    @Override
    public int getCost() {
        return bus.getCost();
    }

    @Override
    public int getSeatCount() {
        return bus.getSeatCount();
    }

    @Override
    public boolean existBabyCarSeat() {
        // 버스어댑터에서는 카시트 유무에 대한 메소드를 제공하지 않는다.
        throw new UnsupportedOperationException();
    }
}
