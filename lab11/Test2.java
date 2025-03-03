package lab11;

public class Test2 {
    public static void method3() throws RuntimeException {
        throw new RuntimeException("RuntimeException occumed in method3");
    }

    public static void method2() throws RuntimeException{
        try{
            method3();
        }
        catch(RuntimeException exception){
            System.out.printf("The following excepion occurred in method2\n%s\n",exception.toString());
            throw exception;
        }
    }

    public static void method1() throws RuntimeException{
        try{
            method2();
        }
        catch(RuntimeException exception){
            System.out.printf("The following excepion occured in method1\n%s\n",exception.toString());
            throw exception;
        }
    }

    public static void main(String[] args) {
        try{
            method1();
        }
        catch(RuntimeException exception){
            System.out.printf("The following excepion occured in main\n%s\n",exception.toString());
        }
    }
}
