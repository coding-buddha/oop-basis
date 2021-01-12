package bad.step01;

public class Main {

    public static void main(String[] args) {

        // 다크로스트 커피 : 생두를 오래 볶아 검은색을 띄는 원두로 만든 커피
        final DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.getCost());

        System.out.println();

        // 다크로스트 커피에 스팀우유를 추가한 커피
        final DarkRoastWithSteamedMilk darkRoastWithSteamedMilk = new DarkRoastWithSteamedMilk();
        System.out.println(darkRoastWithSteamedMilk.getDescription());
        System.out.println(darkRoastWithSteamedMilk.getCost());

        System.out.println();

        // 다크로스트 커피에 휘핑크림을 추가한 커피
        final DarkRoastWithWhipandSoy darkRoastWithWhipandSoy = new DarkRoastWithWhipandSoy();
        System.out.println(darkRoastWithWhipandSoy.getDescription());
        System.out.println(darkRoastWithWhipandSoy.getCost());
    }
}
