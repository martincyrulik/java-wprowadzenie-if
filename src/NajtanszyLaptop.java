/**
 * Napisz program, który przechowa ceny 3 laptopów, a następnie
 * wybierze najtańszy z nich. Jeśli ceny się zmienią, program
 * powinien dalej wybierać najtańszy.
 */

public class NajtanszyLaptop {
    public static void main(String[] args) {

        double cheapestLaptop;
        double firstLaptop = 6499;
        double secondLaptop = 1499.5;
        double thirdLaptop = 3199;

        if (firstLaptop < secondLaptop) {
            cheapestLaptop = firstLaptop;
        } else {
            cheapestLaptop = secondLaptop;
        }
        if (thirdLaptop < cheapestLaptop) {
            cheapestLaptop = thirdLaptop;
        }
        System.out.println("The cheapest of laptops is: " + cheapestLaptop);
    }
}
