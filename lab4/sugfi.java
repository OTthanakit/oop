package lab4;

public class sugfi {
    public static void main(String[] args) {
        int array[]={3,2,5};
        for(int i = 0; i<3;i++)
            array[i]*=2;
            for(int j:array){
                System.err.printf("%d",j);
            }
            System.err.println();
        
    }
}
