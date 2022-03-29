import java.util.Scanner;

public class Kalkulator {

    //Deklaracje zmiennych.

    private static double wynik;
    double num1;
    double num2;
    char dzialanie;

    public static void main(String[] args) {

        System.out.println("KALKULATOR");
        System.out.println("Dostepne dzialania: + , - , * , / ");

        /*
        Program pyta o dwie liczby
        i dzialanie jakie ma wykonać.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double num1 = scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double num2 = scanner.nextDouble();
        System.out.println("Wybierz dzialanie: ");
        char dzialanie = scanner.next().charAt(0);

        /*
        Jak już się dowie co trzeba zrobić, wykonuje wybrane działanie,
        jeżeli zamiast znaku działania podamy coś innego, program powie że
        użytkownik musi wybrać coś innego i sie obrazi.
         */

        switch(dzialanie) {

            case '+':
                wynik = num1 + num2;
                break;

            case '-':
                wynik = num1 - num2;
                break;

            case '*':
                wynik = num1 * num2;
                break;

            case '/':
                wynik = num1 / num2;
                break;

            default:
                System.out.println("Blad! Wybierz jedno dzialanie z powyzszych! ( +, -, *, / )");
        }

        /*
        Program pokazuje wynik działania, kończąc również cały proces.
         */

        System.out.println("Wynik dzialania: " + wynik);
    }

} 
