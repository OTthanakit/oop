package HomeWork;
import java.util.Scanner;
public class hw {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        n = sc.nextInt();
        String[] Day = {"Error","Monday","Tuesday","Wednesday","Thuesday","Friday","Saturday","Sunday"};
        if(n >= 1 && n <= 7){
            System.err.println(Day[n]);
        }
        else{
            System.err.println(Day[0]);
        }
    }
}
