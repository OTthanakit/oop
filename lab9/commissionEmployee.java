package lab9;

public class commissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecunityNumber;
    private double grossSales;
    private double commissionRates;

    public commissionEmployee(String first, String last, String ssn, double sales, double rate){
        firstName = first;
        lastName = last;
        socialSecunityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
        System.out.printf("\nCommissionEmployee constructor:\n%s\n",this);
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public String getLastName(){
        return lastName;
    }
    
    public void setSocialSecunityNumber(String ssn){
        socialSecunityNumber = ssn;
    }

    public String getSocialSecunityNumber(){
        return socialSecunityNumber;
    }

    public void setGrossSales(double sales){
        grossSales = (sales < 0.0)? 0.0 : sales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double rate){
        commissionRates = (rate > 0.0 && rate < 1.0)? rate : 0.0;
    }

    public double getCommissionRate(){
        return commissionRates;
    }

    public double eamings(){
        return getCommissionRate()*getGrossSales();
    }

    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "commission employee",getFirstName(),getLastName(),"social secunity number", getSocialSecunityNumber(),"gross sales",getGrossSales(),"commission rate",getCommissionRate());
    }
}
