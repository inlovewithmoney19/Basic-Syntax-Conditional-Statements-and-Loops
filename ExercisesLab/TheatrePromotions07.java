import java.util.Scanner;

public class TheatrePromotions07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String period = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isValid = true;
        if(ages >= 0 && ages <= 18){
            if(period.equals("Weekday")){
                price = 12;
            }else if (period.equals("Weekend")){
                price = 15;
            }else if (period.equals("Holiday")){
                price = 5;
            }else {
                isValid = false;
            }
        }else if (ages > 18 && ages <= 64){
            if(period.equals("Weekday")){
                price = 18;
            }else if (period.equals("Weekend")){
                price = 20;
            }else if (period.equals("Holiday")){
                price = 12;
            }else {
                isValid = false;
            }
        } else if (ages > 64 && ages <=122){
            if(period.equals("Weekday")){
                price = 12;
            }else if (period.equals("Weekend")){
                price = 15;
            }else if (period.equals("Holiday")){
                price = 10;
            }else {
                isValid = false;
            }
        } else {
            isValid = false;
        }
        if (!isValid){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$",price);
        }
    }
}
