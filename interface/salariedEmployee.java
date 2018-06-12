public class salariedEmployee extends employee{
  private double weeklySalary;

  public salariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
    super(firstName, lastName, socialSecurityNumber);
    this.weeklySalary = weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary){
    
    if (weeklySalary < 0)
    {
      throw new IllegalArgumentException("Salary can't be negative!");
    }
    else { 
    this.weeklySalary = weeklySalary;
    }
  }

  public double getWeeklySalary(){
    return weeklySalary;
  }


@Override
public double getPaymentAmount(){
  return getWeeklySalary();
}

}