package lab6;
import java.util.Scanner;
public class Greeting {
    int inputNumber;
    String greetingString;
    public void greeting(){
        Scanner input = new Scanner(System.in);
        System.err.println("Enter 1 for an English greeting\nEnter 2 for a Spenish greeting");
        inputNumber = input.nextInt();
        greet(inputNumber);
        System.err.println(greetingString);
    }
    public void greet(int x){
        if(x == 1){
            greetingString = "Hello";
        }
        else if(x == 2){
            greetingString = "Hole";
        }
        else{
            greetingString = "Invalld input";
        }
    }
}
