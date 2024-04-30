package week6;

public class employee 
{
	String name;
    double hourlyRate;
    int hoursWorked;

    public employee(String name, double hourlyRate, int hoursWorked) 
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public String getName()
    {
        return name;
    }

    public double getHourlyRate() 
    {
        return hourlyRate;
    }

    public int getHoursWorked() 
    {
        return hoursWorked;
    }
}
class PayrollCalculator
{
    public double calculatePay(employee employee) 
    {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        employee employee = new employee("John Doe", 20.0, 40);
        PayrollCalculator calculator = new PayrollCalculator();
        double pay = calculator.calculatePay(employee);
        System.out.println("Payroll for " + employee.getName() + ": " + pay);
    }
}

