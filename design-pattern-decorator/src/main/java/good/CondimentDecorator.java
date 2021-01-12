package good;

public abstract class CondimentDecorator extends Beverage {

    /**
     * 책에서는 서브클래스들에게 getDescription() 메소드를 새로 구현하도록 만들 계획으로 작성되어있다고 되어있다.
     * 하지만 없어도 작동은 되고, 서브클래스들에게 하나의 형식을 맞춰주기 위함이라고만 생각하자.
     * @return
     */
    @Override
    protected abstract String getDescription();
}
