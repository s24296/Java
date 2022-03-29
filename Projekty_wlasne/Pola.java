import java.util.Scanner;

public class Pola {

        double a;
        double b;
        double h;
        double e;
        double f;
        double r;
        static double wynik;
        double wybor;
        static double wyborromb;
        char dzialanie;

        public static void main(String[] args) {

            System.out.println("WITAM W KALKULATORZE POL FIGUR PRZEROZNYCH");
            System.out.println("   ***             ******              ***");
            System.out.println("Wybierz jakie pole chcesz policzyc: ");
            System.out.println("1. Pole kola");
            System.out.println("2. Pole trapezu");
            System.out.println("3. Pole trojkata");
            System.out.println("4. Pole prostokata lub kwadratu");
            System.out.println("5. Pole rombu");
            System.out.println("6. Pole rownolegloboku");
            System.out.println("7. Wyjscie");
            Scanner scanner = new Scanner(System.in);
            double wybor = scanner.nextDouble();

            switch((int) wybor) {

                case 1:
                    System.out.println("Podaj promien kola: ");
                    double r = scanner.nextDouble();
                    wynik = r * 3.14;
                    System.out.println("Pole kola to: " + wynik);
                    break;

                case 2:
                    System.out.println("Podaj bok a: ");
                    double a = scanner.nextDouble();
                    System.out.println("Podaj bok b: ");
                    double b = scanner.nextDouble();
                    System.out.println("Podaj wysokosc: ");
                    double h = scanner.nextDouble();
                    wynik = ((a + b)*h)/2;
                    System.out.println("Pole trapezu wynosi: " + wynik);
                    break;

                case 3:
                    System.out.println("Podaj podstawe trojkata: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj wysokosc trojkata: ");
                    h = scanner.nextDouble();
                    wynik = (a * h) / 2;
                    System.out.println("Pole trojkata wynosi: " + wynik);
                    break;

                case 4:
                    System.out.println("Podaj bok a: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj bok b: ");
                    b = scanner.nextDouble();
                    if(a == b){
                        wynik = a * b;
                        System.out.println("Pole kwadratu wynosi: " + wynik);
                        break;
                    } else
                    wynik = a * b;
                    System.out.println("Pole prostokatu wynosi: " + wynik);
                    break;

                case 5:
                    System.out.println("Chcesz policzyc pole z: ");
                    System.out.println("1. Wysokosci i podstawy");
                    System.out.println("2. Przekatnych");
                    wyborromb = scanner.nextDouble();

                    switch((int) wyborromb) {

                        case 1:
                            System.out.println("Podaj podstawe: ");
                            a = scanner.nextDouble();
                            System.out.println("Podaj wysokosc: ");
                            b = scanner.nextDouble();
                            wynik = a * b;
                            System.out.println("Pole rombu wynosi: " + wynik);
                            break;

                        case 2:
                            System.out.println("Podaj przekatna e: ");
                            double e = scanner.nextDouble();
                            System.out.println("Podaj przekatna f: ");
                            double f = scanner.nextDouble();
                            wynik = (e * f) / 2;
                            System.out.println("Pole rombu wynosi: " + wynik);
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Podaj podstawe a: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj wysokosc h: ");
                    h = scanner.nextDouble();
                    wynik = (a * h);
                    System.out.println("Pole rownolegloboku wynosi: " + wynik);
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Blad! Wybierz jakie pole chcesz obliczyc!");
                    break;
            }
        }
    }


