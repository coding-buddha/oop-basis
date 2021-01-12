package bad.step02;

public class Main {

    public static void main(String[] args) {

        // 다크로스트 커피 : 생두를 오래 볶아 검은색을 띄는 원두로 만든 커피
        final DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getCost());
        System.out.println();

        // 다크로스트 커피에 스팀우유를 추가한 커피
        final DarkRoast darkRoastWithSteamedMilk = new DarkRoast();
        darkRoastWithSteamedMilk.setSteamedMilk(true);
        System.out.println(darkRoastWithSteamedMilk.getCost());
        System.out.println();

        // 다크로스트 커피에 휘핑크림을 추가한 커피
        final DarkRoast darkRoastWithWhipandSoy = new DarkRoast();
        darkRoastWithWhipandSoy.setWhipandSoy(true);
        System.out.println(darkRoastWithWhipandSoy.getCost());
        System.out.println();

    }
}
