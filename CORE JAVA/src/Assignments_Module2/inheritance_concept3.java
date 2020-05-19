package Assignments_Module2;
import java.util.*;
abstract class faculty
{
	abstract void skills(int fid,String name,double salary,double rating);
}

class phpfaculty extends faculty
{
	void skills(int fid,String name,double salary,double rating)
	{
		System.out.println("\nFID =>" + fid + "\nNAME =>" + name + "\nSALARY => " + salary + "\nRATING => " + rating);
	}
}

class javafaculty extends faculty
{
	void skills(int fid,String name,double salary,double rating)
	{
		System.out.println("\nFID =>" + fid + "\nNAME =>" + name + "\nSALARY => " + salary + "\nRATING => " + rating);
	}
}

public class inheritance_concept3 {

	public static void main(String[] args) {
		
		System.out.println("ALL DETAILS FOR PHP FACULTY =>");
		phpfaculty pf1=new phpfaculty();
		pf1.skills(01,"DISHA SHAH",80000.00,3.4);
		System.out.println();
		System.out.println("ALL DETAILS FOR JAVA FACULTY =>");
		javafaculty jf1=new javafaculty();
		jf1.skills(02,"TRIPTI DODIYA",100000.00,4.5);
	}

}
