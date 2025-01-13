package HomeWork;

public class ftgf {
    public static void main(String[] args) {
        int [] array = {10,15,30,45,50,65,70,80,90,95};
        System.err.printf("%s%8s%n","Index","Value");
        for(int i = 0; i<array.length;i++){
            System.err.printf("%5d%8d%n", i , array[i]);
        }
    }
}
