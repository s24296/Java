import java.util.Scanner;

public class AlaMaKota {

    int kotki;

    public static void main(String[] args) {

        /*
        Uzylem stringow zeby nie musiec pisac
        wiele razy Ala ma... xD
         */

        String a = "Ala ma ";
        String b = " kotka";
        String c = " kotki";
        String d = " kotkow";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile Ala ma kotkow? ");
        int kotki = scanner.nextInt();

        try {
            if(kotki == 1){
                System.out.println(a + kotki + b);
                System.exit(0);
            }
            else if(kotki == 0){
                System.out.println("Ala nie ma kotkow :(");
                System.exit(0);
            }
            else if(kotki <= 4){
                System.out.println(a + kotki + c);
                System.exit(0);
            }
            else if(kotki >= 5){
                System.out.println(a + kotki + d);
                System.exit(0);
            }

        } catch (Exception brakliczby){
            System.out.println("Podaj liczbe kotkow!!!");
            System.exit(0);
        }
    }
}

