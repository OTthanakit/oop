package HomeWork;
import java.util.Scanner;
public class HW3Time2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HW3Time2 time = new HW3Time2();
        int choice = getMenuChoice();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    System.out.print("Enter Hours: ");
                    int hours = sc.nextInt();
                    if (hours >= 0 && hours < 24) {
                        time.setHour(hours);
                    }
                    else{
                        System.out.println("Error: Invalid hour. Please enter a value between 0 and 23");
                    }
                    break;
                case 2:
                    System.out.print("Enter Minutes: ");
                    int minute = sc.nextInt();
                    if (minute >= 0 && minute < 60) {
                        time.setMin(minute);
                    }
                    else{
                        System.out.println("Error: Invalid minute. Please enter a value between 0 and 60");
                    }
                    break;
                case 3:
                    System.out.print("Enter Second: ");
                    int second = sc.nextInt();
                    if (second >= 0 && second < 60) {
                        time.setSec(second);
                    }
                    else{
                        System.out.println("Error: Invalid second. Please enter a value between 0 and 60");
                    }
                    break;
                case 4:
                time.tick();
                    break;
                default:
                System.out.println("Invalid choice.");
                    break;
            }
            System.out.printf("Hour: %d Minute: %d Second: %d\n",time.getHour(),time.getMin(),time.getSec());
            System.out.printf("Universal time: %s Standdard time: %s\n", time.toUniversalString(), time.toString());
            choice = getMenuChoice();
        }
    }
    private static int getMenuChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Set Hour");
        System.out.println("2.Set Minute");
        System.out.println("3.Set Second");
        System.out.println("4.Add 1 second");
        System.out.println("5.Exit");
        System.out.println("Choice");
        return sc.nextInt();
    }
}
