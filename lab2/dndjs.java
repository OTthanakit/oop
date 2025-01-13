package lab2;
import java.util.Scanner;
public class dndjs {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter integer");
        number = sc.nextInt();
        if(number!=7){
            System.err.println("Welcome");
        }
        if((number%5)==0){
            System.err.println("To Java Programming");
        } 
    }
}
