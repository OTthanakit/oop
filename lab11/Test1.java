package lab11;

public class Test1 {
    public static String lessThan100(int number)throws Exception {
        if (number >= 100) {
            throw new Exception("Number too large");
        }
        return String.format("The number %d is less than 100", number);
    }
    public static void main(String[] args) {
        try{
            System.out.println(lessThan100(1));
            System.out.println(lessThan100(22));
            System.out.println(lessThan100(100));
            System.out.println(lessThan100(11));
        }
        catch(Exception exception){
            System.out.println(exception.toString());
        }
    }
}
