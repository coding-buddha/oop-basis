package good;

/**
 * 버스 인터페이스
 */
public interface Bus {
    int getCost();      // 가격
    int getSeatCount(); // 좌석 수
    BusType getType();
}
