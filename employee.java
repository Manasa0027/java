package practice;

class employee 
{
	String name;
    String designation;
    void setemployee(String n, String desig)
    {
       name = n;
       designation = desig;
    }
    void get_employee_details() 
    {
        System.out.println(name+"\t"+designation);
    }
}
class employee_details
{
	public static void main(String args[])
	{
		employee b=new employee();
		b.setemployee("BOB","Manager");
		System.out.println("NAME\tDESIGNATION");
		b.get_employee_details();
	}
}