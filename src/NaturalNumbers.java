/**
 * Napisz program, który przechowa 5 liczb naturalnych,
 * a następnie sprawdzi je wg określonego wzoru:
 * jeśli liczba*2+4 < 8, wypisz "Tak"
 * jeśli liczba*2+4 >= 8, wypisz "Nie"
 */

public class NaturalNumbers {
    public static void main(String[] args) {

        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 0;
        int fourthNumber = 3;
        int fifthNumber = 4;

        if (firstNumber*2 + 4 < 8) {
            System.out.println(firstNumber + " * 2 + 4 < 8 " + "Tak");
        } else {
            System.out.println(firstNumber + " * 2 + 4 >= 8 " + "Nie");
        }
        if (secondNumber*2 + 4 < 8) {
            System.out.println(secondNumber + " * 2 + 4 < 8 " + "Tak");
        } else {
            System.out.println(secondNumber + " * 2 + 4 >= 8 " + "Nie");
        }
        if (thirdNumber*2 + 4 < 8) {
            System.out.println(thirdNumber + " * 2 + 4 < 8 " + "Tak");
        } else {
            System.out.println(thirdNumber + " * 2 + 4 >= 8 " + "Nie");
        }
        if (fourthNumber*2 + 4 < 8) {
            System.out.println(fourthNumber + " * 2 + 4 < 8 " + "Tak");
        } else {
            System.out.println(fourthNumber + " * 2 + 4 >= 8 " + "Nie");
        }
        if (fifthNumber*2 + 4 < 8) {
            System.out.println(fifthNumber + " * 2 + 4 < 8 " + "Tak");
        } else {
            System.out.println(fifthNumber + " * 2 + 4 >= 8 " + "Nie");
        }
    }
}
