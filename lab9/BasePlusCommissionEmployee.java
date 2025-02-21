package lab9;

public class BasePlusCommissionEmployee {
     private commissionEmployee commissionEmployee;
     private double baseSalary;

     public BasePlusCommissionEmployee(String first, String Last, String ssn, double sales, double rate, double salary){
          commissionEmployee = new commissionEmployee(first, Last, ssn, sales, rate);
          setBaseSalary(salary);
     }

     public void setFirstName(String first) {
          commissionEmployee.setFirstName(first);
     }

     public String getFirstName(){
          return commissionEmployee.getFirstName();
     }

     public void setLastName(String last){
          commissionEmployee.setLastName(last);
     }

     public String getLastName(){
          return commissionEmployee.getLastName();
     }
     
     public void setSocialSecunityNumber(String ssn){
          commissionEmployee.setSocialSecunityNumber(ssn);
     }

     public String getSocialSecunityNumber(){
          return commissionEmployee.getSocialSecunityNumber();
     }

     public void setGrossSales(double sales){
          commissionEmployee.setGrossSales(sales);
     }

     public double getGrossSales(){
          return commissionEmployee.getGrossSales();
     }

     public void setCommissionRate(double rate){
          commissionEmployee.setCommissionRate(rate);
     }

     public double getCommissionRate(){
          return commissionEmployee.getCommissionRate();
     }

     public void setBaseSalary(double salary){
          baseSalary = (salary < 0.0) ? 0.0 : salary;
     }

     public double getBaseSalary(){
          return baseSalary;
     }

     public double eamings(){
          return getBaseSalary() + commissionEmployee.eamings();
     }

     public String toString(){
          return String.format("%s %s \n%s : %.2f","base-salaried", commissionEmployee.toString(),"base salary",getBaseSalary());
     }
}
