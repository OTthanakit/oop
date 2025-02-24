package lab10;

public abstract class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn,double salary){
        super(first, last, ssn);
        setWeeklySalary(salary);
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklSalary(){
        return weeklySalary;
    }

    public double earnings(){
        return getWeeklSalary();
    }

    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklSalary());
    }
}
