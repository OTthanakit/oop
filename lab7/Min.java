package lab7;
import java.util.Scanner;
public class Min {
        public void findMininmun(){
            Scanner input = new Scanner(System.in);
            double one;
            double two;
            double three;
            System.out.printf("%s\n%s\n%s\n",
            "Type the end-of-flle indicator to terminate",
            "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
            "On windows type <ctrl> z then press Enter");
            System.out.println("Or enter first number:");
            while(input.hasNext()){
                one = input.nextDouble();
                System.err.println("Enter second number");
                two = input.nextDouble();
                System.err.println("Enter second number");
                three = input.nextDouble();
                System.err.println("Enter second number");
                System.err.printf("Mininmun is %.2f\n",mininmun3(one, two, three));
                System.out.printf("\n%s\n%s\n%s\n",
                "Type the end-of-flle indicator to teminaate",
                "On UNIX/Linux/Mac OS X Type <ctrl> d then press Enter",
                "On Window type <ctrl> z then press Enter");
            }
        }
        public double mininmun3(double one, double two, double three){
            return Math.min(Math.min(one, two),three);
        }
    }
