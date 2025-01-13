package lab4;

public class xsyrared {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        System.err.println(medthod1(A));
    }
    public static int medthod1(int[] values) {
        int mystery = 1;
        for(int i:values){
            mystery*=i;
        }
        return mystery;
    }
}
