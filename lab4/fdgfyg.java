package lab4;

public class fdgfyg {
    public static void main(String[] args) {
        int array [][] = {{3,2,5},{2,2,4,5,6},{1,1}};
        System.err.println(medthod2(array));
    }
    public static int medthod2(int values[][]) {
        int mystery = 1;
        for(int i[]:values){
            for(int j:i){
                mystery *=j;
            }
        }
        return mystery;        
    }
}
