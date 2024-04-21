package practice;

public class person 
{
	String Name;
	int age;
	String gender;
	person()
	{
		Name=null;
		age=0;
		gender=null;
	}
	person(String Name,int age,String gender)
	{
		this.Name=Name;
		this.age=age;
		this.gender=gender;
	}
	void introduce()
	{
		System.out.println(Name +"\t"+age+"\t\t"+gender);
	}
	public static void main(String args[])
	{
		System.out.println("PERSON_NAME\tPERSON_AGE\tPERSON_GENDER");
		person mok=new person("mokshitha",20,"Female");
		mok.introduce();
	}
}
