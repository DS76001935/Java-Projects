package collection_frameworks;
import java.util.*;

public class concept4 {
	static String roll_no = "";
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Model> hm = new HashMap();
	static int i,size,op;
	static String op1;
	static boolean exit=false;
	static boolean exit1=false;
	public static void main(String args[]) {
		
		Operation();
		
	}
	
	public static void Operation()
	{
		do
		{
			if(exit==false)
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Press 1 For Insert The Whole Data Of Perticuler Student !");
				System.out.println("Press 2 For Display The Whole Data Of Perticuler Student !");
				System.out.println("Press 3 For Update The Whole Data Of Perticuler Student !");
				System.out.println("Press 4 For Delete The Whole Data Of Perticuler Student !");
				System.out.println("Press 5 For EXIT !");
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter The Any Chice =>");
				op=sc.nextInt();
				switch(op)
				{
					case 1:
						System.out.println("Enter The Records Of How Many Students ?");
						size=sc.nextInt();
						for(i=1;i<=size;i++)
						{
							AddData();
						}
						break;
					case 2:
						Printdata();
						break;
					case 3:
						System.out.println("How Many Records You Are Update ?");
						size=sc.nextInt();
						for(i=1;i<=size;i++)
						{
							UpdateData();
						}
						break;
					case 4:
						System.out.println("How Many Records You Are Delete ?");
						size=sc.nextInt();
						for(i=1;i<=size;i++)
						{
							RemoveData();
						}
						break;
					case 5:
						exit=true;
						System.out.println("Exit From This Application !");
						break;
					default:
						System.out.println("INVALID CHOICE !");
				}
			}
			else
			{
				break;
			}
		}while(op!=5);
	}
	
	public static void AddData() {
		System.out.println("#INSERTION#");
		System.out.println("Adding Details For " + i + " Student =>");
		sc.nextLine();
		System.out.println("Enter The Roll No =>");
		roll_no = sc.nextLine();
		hm.put(roll_no, ScanAddData());
		System.out.println(i + " Record Can Inserted Successfully !");
	}
	
	public static void UpdateData() {
		System.out.println("Enter The Roll No =>");
		sc.nextLine();
		roll_no = sc.nextLine();
		if(hm.containsKey(roll_no))
		{
			System.out.println("#UPDATION#");
			hm.put(roll_no, ScanAddData());
		}
		else
		{
			System.out.println("This Student Is Cannot Exist !");
		}
	}

	public static void RemoveData()
	{
		System.out.println("#DELETION#");
		System.out.println("Removing Details For " + i + " Student =>");
		sc.nextLine();
		System.out.println("Enter The Rollno =>");
		roll_no=sc.nextLine();
		hm.remove(roll_no);
		System.out.println(i + " Record Can Deleted Successfully !");
	}

	public static Model ScanAddData() {

			System.out.println("\nEnter The Full Name =>");
			String name = sc.nextLine();
			System.out.println("Enter Email ID =>");
			String email = sc.nextLine();
			System.out.println("Enter The Contact Number =>");
			String contact = sc.nextLine();
			System.out.println("Enter The Address =>");
			String address = sc.nextLine();
		return new Model(roll_no, name, email, contact, address);
	}

	public static void Printdata() {
		sc.nextLine();
		System.out.println("\nEnter The Roll No To Fetch Data : ");
		String enr = sc.nextLine();
		if (hm.containsKey(enr)) {
			System.out.println("#VIEW ALL DETAILS OF THIS STUDENT#");
			System.out.println(hm.get(enr).getdata());
		}else {
			System.out.println("No User Can Exist !");
		}
	}
}

class Model {
	String rollno, name, email, contact, address;

	Model(String roll, String nm, String em, String con, String add) {
		rollno = roll;
		name = nm;
		email = em;
		contact = con;
		address = add;
	}

	public String getdata() {
		return "Roll No => " + rollno + "\n" + "Full Name => " + name + "\n" + "Email ID => " + email + "\n" + "Contact Number => "
				+ contact + "\n" + "Address => " + address + "\n";
	}

}
