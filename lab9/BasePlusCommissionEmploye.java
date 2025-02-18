package lab9;

public class BasePlusCommissionEmploye extends commissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmploye(String first, String last, String ssn, double sales, double rate, double Salary){
        super(first,last,ssn,sales,rate);
        setBaseSalary(sales);
    }

    public void setBaseSalary(double salery){
        baseSalary = (salery < 0.0)? 0.0 : salery;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double eamings(){
        return getBaseSalary() + super.eamings();
    }

    public String toString(){
        return String.format("%s %s\n%s: %.2f", "base-salaried",super.toString(),"base salary",getBaseSalary());
    }
}
