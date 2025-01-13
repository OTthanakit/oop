package HomeWork;
import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number:");
        n = sc.nextInt();
        if(n==1){
            System.err.println("Monday");
        }
        else if (n==2) {
            System.err.println("Tuesday");
        }
        else if(n==3){
            System.err.println("Wenday");
        }
        else if(n==4){
            System.err.println("Thuesday");
        }
        else if(n==5){
            System.err.println("Friday");
        }
        else if(n==6){
            System.err.println("Saturday");
        }
        else if(n==7){
            System.err.println("Sunday");
        }
        else{
            System.err.println("Error");
        }
    }
}
