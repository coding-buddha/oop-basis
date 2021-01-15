package good;

/**
 * 승용차 인터페이스
 */
public interface Car {
    int getCost();              // 가격
    int getSeatCount();         // 좌석 수
    boolean existBabyCarSeat(); // 카시트 여부
}
