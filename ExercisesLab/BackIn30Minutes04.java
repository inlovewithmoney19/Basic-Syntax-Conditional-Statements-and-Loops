import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = (hours * 60) + minutes + 30 ;

        int backHour = timeInMinutes / 60 ;
        int backMinutes =  timeInMinutes % 60;

        if (backHour >= 24) {
            backHour = 0;
        }
        System.out.printf("%d:%02d",backHour, backMinutes);
    }
}
