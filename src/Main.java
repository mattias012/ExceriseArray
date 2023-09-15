import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Övningsuppgifter Funktioner
        //1
        Scanner scanner = new Scanner(System.in);
        String menu = "Vad vill du göra?\n" +
                "1. Addera två tal\n" +
                "2. Räkna bokstäver i en sträng\n" +
                "3. Spegelvänd en sträng\n" +
                "4. Summera alla tal i en sträng\n" +
                "e. Avsluta \n";

        System.out.println(menu);

        Boolean proceed = true;
        String select = scanner.nextLine();

        if (!select.contains("e")) {
            while (proceed) {
                int choice = Calculations.menuChoice(select);

                if (choice == 1) {
                    System.out.println("Skriv ditt första tal du vill addera: ");
                    double firstNumber = scanner.nextDouble();

                    System.out.println("Tack. Skriv det andra talet du vill addera: ");
                    double secondNumber = scanner.nextDouble();

                    System.out.println("Summan av " + firstNumber + " och " + secondNumber + " är ");
                    double result = Calculations.addNumbers(firstNumber, secondNumber);

                    System.out.println(result);

                } else if (choice == 2) {

                    System.out.println("Skriv något:");
                    String theString = scanner.nextLine();

                    System.out.println("Vilken bokstav söker du efter?: ");
                    String ch = scanner.nextLine();
                    ch = ch.substring(0, 1).trim();

                    int numberOfTimes = Calculations.countString(theString, ch);

                    System.out.println("Bokstaven " + ch + " finns " + numberOfTimes + " ggr");

                } else if (choice == 3) {

                    System.out.println("Skriv en sträng som du vill spegelvänd: ");

                    String theString = scanner.nextLine();
                    String reversed = Calculations.reverseString(theString);

                    System.out.println(theString + " blir baklänges " + reversed);

                } else if (choice == 4) {

                    System.out.println("Skriv en sträng med siffror som du vill addera: ");
                    String theString = scanner.nextLine();

                    int addThis = Calculations.addNumbersInString(theString);

                    System.out.println("Summan av din sträng är " + addThis);


                } else {
                    System.out.println("Du måste välja något av alternativen");
                }

                System.out.println();
                System.out.println(menu);

                if (choice != 5){
                    scanner.nextLine();
                }
                select = scanner.nextLine();

                if (select.equals("e")) {
                    proceed = false;
                    System.out.println("Programmet avslutas!");
                }
            }
        } else {
            System.out.println("Programmet avslutas!");
        }
    }
}