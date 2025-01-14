import java.util.Scanner;
public class Min {
    public void findMinimun(){
        Scanner input = new Scanner(System.in);
        double one;
        double two;
        double three;
        System.err.printf("%S\n%s\n%s\n","Type the end-of-file indicator to terminate","On UNIX/Linux/Mac OS X type <ctrl> d then press Enter","On Window type <ctrl> z then press Enter");
        System.err.println("Or enter frist number:");
        while (input.hasNext()) { 
            one = input.nextDouble();
            System.err.println("Enter Second number");
            two = input.nextDouble();
            System.err.println("Enter Second number");
            three = input.nextDouble();
            System.err.println("Enter Second number");
            System.err.printf("Minimun is %.6f\n",minimun3(one, two, three));
            System.err.printf("%S\n%s\n%s\n","Type the end-of-file indicator to terminate","On UNIX/Linux/Mac OS X type <ctrl> d then press Enter","On Window type <ctrl> z then press Enter");
        }
    }
    public double minimun3(double one,double two,double three){
        return Math.min(Math.min(one, two),three);
    }
}
