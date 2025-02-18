package lab9;

public class BasePlusCommissionEmplyeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmploye employe = new BasePlusCommissionEmploye("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        System.out.println("Employee information obtained by get methods:\n");
        employe.setBaseSalary(1000);
        System.out.printf("%n%s:%n%n%s%n","Updated employee information obtsined by toString",employe.toString());
    }
}
