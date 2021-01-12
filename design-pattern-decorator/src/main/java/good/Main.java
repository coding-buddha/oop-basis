package good;

public class Main {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getCost());
        System.out.println(darkRoast.getDescription());
        System.out.println();

        Beverage darkRoastWithMilk = new SteamedMilk(darkRoast);
        System.out.println(darkRoastWithMilk.getCost());
        System.out.println(darkRoastWithMilk.getDescription());
        System.out.println();

        Beverage darkRoastWithMilkTwice = new SteamedMilk(darkRoastWithMilk);
        System.out.println(darkRoastWithMilkTwice.getCost());
        System.out.println(darkRoastWithMilkTwice.getDescription());
        System.out.println();
    }
}
