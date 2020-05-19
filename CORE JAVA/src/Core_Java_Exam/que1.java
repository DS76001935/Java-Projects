package Core_Java_Exam;

class Employee
{
	Employee()
	{
		System.out.println("Default Constructor Is Called !");
	}
	Employee(String str)
	{
		System.out.println("Paramiterized Constructor Is Called !");
		System.out.println("Your Parameter Is =>" + str);
	}
	Employee(Employee e)
	{
		System.out.println("Copy Constructor Is Called !");
	}
}

public class que1 {
	Employee e1 = new Employee();
	Employee e2 = new Employee("Hiiii.....My Name Is Deep !");
	Employee e3 = new Employee(e2);
}
