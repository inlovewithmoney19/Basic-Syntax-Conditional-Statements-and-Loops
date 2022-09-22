import java.util.Scanner;

public class MultiplicationTable11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", numOne, numTwo, numOne * numTwo);
            numTwo++;
        }while (numTwo <= 10) ;
    }
}

