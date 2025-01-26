/**
 * Napisz program który dla podanej liczby metrów zaproponuje
 * którego środka transportu powinieneś użyć
 * do 300 m pieszo
 * do 2700 m rower
 * do 1000 km samochód
 * powyżej 1000 km samolot
 */


public class MeansOfTransportation {
    public static void main(String[] args) {

        int distance = 10001;

        if (distance <= 300) {
            System.out.println("Powinieneś pójść pieszo.");
        } else if (distance <= 2700) {
            System.out.println("Powinieneś pojechać rowerem.");
        } else if (distance <= 10000) {
            System.out.println("Powineneś pojechać samochodem.");
        } else {
            System.out.println("Powinieneś polecieć samolotem.");
        }
    }
}
