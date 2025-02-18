package lab9;

public class BasePlusCommissionEmplyeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmploye employe = new BasePlusCommissionEmploye("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        System.out.println("Employee information obtained by get methods:\n");
        System.out.printf("%s %s%n","First name is",employe.getFirstName());
        System.out.printf("%s %s%n","Last name is",employe.getLastName());
        System.out.printf("%s %s%n","Social security is",employe.getSocialSecunityNumber());
        System.out.printf("%s %s%n","Gross sales is",employe.getGrossSales());
        System.out.printf("%s %s%n","Commission rate is",employe.getCommissionRate());
        System.out.printf("%s %s%n","Base salary is",employe.getBaseSalary());
        employe.setBaseSalary(1000);
        System.out.printf("%n%s:%n%n%s%n","Updated employee information obtsined by toString",employe.toString());
    }
}
