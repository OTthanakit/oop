package lab2 ;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        int integer;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter an integer:");
        integer = sc.nextInt();
        if((integer % 6 )==0){
            System.err.println("Hello");
        }
        else{
            System.err.println("Good Boy");
        }
    }
}
