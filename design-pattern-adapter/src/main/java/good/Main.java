package good;

public class Main {
    public static void main(String[] args) {

        final Car busAdapter = new BusAdapter(new ExpressBus());

        try {
            System.out.println(busAdapter.getCost());
            System.out.println(busAdapter.getSeatCount());
            System.out.println(busAdapter.existBabyCarSeat());
        } catch (RuntimeException e) {
            // existBabyCarSeat 는 어댑티 쪽에서 제공하지 않기 때문에 에러를 던진다.
            e.printStackTrace();
        }
    }
}
