package lab10;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String SocialSecunityNumber;

    public Employee(String first, String last, String ssn){
        firstName = first;
        lastName = last;
        SocialSecunityNumber = ssn;
    }

    public void setFirstName(String first){
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

    public void setSocialSecunltyNumber(String ssn){
        SocialSecunityNumber = ssn;
    }

    public String getSocailSecunltyNumber(){
        return SocialSecunityNumber;
    }

    public String toString(){
        return String.format("%s %s\n socail secunity: %s", getFirstName(),getLastName(),getSocailSecunltyNumber());
    }

    public abstract double earnings();

}
