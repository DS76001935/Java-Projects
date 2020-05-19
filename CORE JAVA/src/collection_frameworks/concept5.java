package collection_frameworks;
import java.util.HashMap;
import java.util.Scanner;

public class concept5 {
		static String code = "";
		static Scanner sc = new Scanner(System.in);
		static HashMap<String, Model1> hm = new HashMap();
		static int i,size,op;
		static String name;
		static int age,weight;
		static double height;
		static int wickets;
		static long runs;
		static boolean exit=false;
		public static void main(String args[]) {
			
			Operation();
			
		}
		
		public static void Operation()
		{
			do
			{
				if(exit==false)
				{
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("Press 1 For Insert The Whole Data Of Perticuler Cricketer !");
					System.out.println("Press 2 For Display The Whole Data Of Perticuler Cricketer !");
					System.out.println("Press 3 Check Whether This Player Is Either Batsmen , Bolwer Or All Rounder ?");
					System.out.println("Press 4 For Update The Whole Data Of Perticuler Cricketer !");
					System.out.println("Press 5 For Delete The Whole Data Of Perticuler Cricketer !");
					System.out.println("Press 6 For EXIT !");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("Enter The Any Chice =>");
					op=sc.nextInt();
					switch(op)
					{
						case 1:
							System.out.println();
							System.out.println("Enter The Records Of How Many Cricketers ?");
							size=sc.nextInt();
							System.out.println();
							for(i=1;i<=size;i++)
							{
								AddData();
							}
							System.out.println();
							break;
						case 2:
							System.out.println();
							Printdata();
							System.out.println();
							break;
						case 3:
							System.out.println();
							process();
							System.out.println();
							break;
						case 4:
							System.out.println();
							UpdateData();
							System.out.println();
							break;
						case 5:
							System.out.println();
							RemoveData();
							System.out.println();
							break;
						case 6:
							System.out.println();
							exit=true;
							System.out.println("Exit From This Application !");
							System.out.println();
							break;
						default:
							System.out.println("INVALID CHOICE !");
					}
				}
				else
				{
					break;
				}
			}while(op!=7);
		}
		
		public static void AddData() {
			System.out.println("#INSERTION#");
			System.out.println("Adding Details For " + i + " Cricketers =>");
			sc.nextLine();
			System.out.println("Enter The Code =>");
			code = sc.nextLine();
			if (hm.containsKey(code))
			{
				System.out.println("This Cricketer Was Already Exist , So You Cannot Rewrite It On This Code Number !");
			}
			else
			{
				hm.put(code, ScanAddData());
				System.out.println(i + " Records Can Inserted Successfully !");
			}
		}
		
		public static void UpdateData() {
			System.out.println("#UPDATION#");
			System.out.println("Updating Details For " + i + " Cricketer =>");
			sc.nextLine();
			System.out.println("Enter The Code =>");
			code = sc.nextLine();
			if (hm.containsKey(code))
			{
				hm.put(code, ScanAddData());
				System.out.println(i + " Records Can Updated Successfully !");
			}
			else
			{
				System.out.println("Sorry , There Are Nothing This Any Type Of Cricketer , Try Again Later !");
			}
		}

		public static void RemoveData()
		{
			System.out.println("#DELETION#");
			System.out.println("Removing Details For " + i + " Cricketers =>");
			sc.nextLine();
			System.out.println("Enter The Code =>");
			code=sc.nextLine();
			if (hm.containsKey(code))
			{
				hm.remove(code);
				System.out.println(i + " Records Can Deleted Successfully !");
			}
			else
			{
				System.out.println("Sorry , There Are Nothing This Any Type Of Cricketer , Try Again Later !");
			}
		}
		
		public static Model1 ScanAddData() 
		{
				System.out.println("\nEnter Your Full Name =>");
				name = sc.nextLine();
				System.out.println("Enter Your Age =>");
				age = sc.nextInt();
				System.out.println("Enter Your Height =>");
				height = sc.nextDouble();
				System.out.println("Enter Your Weight =>");
				weight = sc.nextInt();
				System.out.println("Enter Your Total Runs =>");
				runs = sc.nextLong();
				System.out.println("Enter Your Total Wickets =>");
				wickets = sc.nextInt();
				return new Model1(code,name,age,height,weight,runs,wickets);
		}
		
		public static void process()
		{
			System.out.println("Enter The Code =>");
			sc.nextLine();
			code=sc.nextLine();
			if (hm.containsKey(code))
			{
				if(runs > 0 && wickets == 0)
				{
					System.out.println("You Are Only a Batsmen !");
				}
				else if(runs == 0 && wickets > 0)
				{
					System.out.println("You Are Only a Bolwer !");
				}
				else if(runs > 0 && wickets > 0)
				{
					System.out.println("Grand Congratulation , You Are a All Rounder Player !");
				}
				else
				{
					System.out.println("Sorry , Invalid Player !");
				}
			}
			else
			{
				System.out.println("Sorry , There Are Nothing This Any Type Of Cricketer , Try Again Later !");
			}
		}
		
		public static void Printdata() {
			sc.nextLine();
			System.out.println("\nEnter The Perticuler Code Number Of Individual Cricketers To Fetch Its Data : ");
			String code = sc.nextLine();
			if (hm.containsKey(code))
			{
				System.out.println("# VIEW ALL DETAILS OF THIS CRICKETER #");
				System.out.println(hm.get(code).getdata());
			}
			else
			{
				System.out.println("Sorry , There Are Nothing This Any Type Of Cricketer , Try Again Later !");
			}
		}
	}

	class Model1
	{
		String code,name;
		int age,weight,wickets;
		double height;
		long runs;

		Model1(String code,String name,int age,double height,int weight,long runs,int wickets)
		{
			this.code=code;
			this.name=name;
			this.age=age;
			this.height=height;
			this.weight=weight;
			this.runs=runs;
			this.wickets=wickets;
		}
		
		
		public String getdata()
		{
			return "\nCode Number => " + code +
			"\nFull Name => " + name +
			"\nReal Age => " + age +
			"\nHeight => " + height +
			"\nWeight => " + weight +
			"\nRuns => " + runs + 
			"\nWickets => " + wickets;
		}

	}
