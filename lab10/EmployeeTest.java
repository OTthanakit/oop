package lab10;

import lab9.commissionEmployee;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("June", "Bug", "123-45-6789", 1000.00);
        commissionEmployee employee2 = new commissionEmployee("Archie", "Tic", "987-65-4321", 15000.00, 0.10);
        Employee fristEmployee = new SalariedEmployee("June", "Bug", "123-45-6789", 1000.00);
        Employee secondEmployee = new commissionEmployee("Archie", "Tic", "987-65-4321", 15000.00, 0.10);
        SalariedEmployee salaried = (SalariedEmployee)fristEmployee;
        commissionEmployee commission = (commissionEmployee)fristEmployee;
        System.out.printf("Employee 1:\n%s\n\n",employee1);
        System.out.printf("Employee 2:\n%s\n\n",employee2);
        System.out.printf("Employee 1:\n%s\n\n",fristEmployee);
        System.out.printf("Employee 2:\n%s\n\n",secondEmployee);
        System.out.printf("salaried:\n%s\n",salaried);
        System.out.printf("commission:\n%s\n", commission);
    }
}
