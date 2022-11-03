package first;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.math.BigInteger;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.Scanner;

public class Main {
	 static ArrayList<School> schoolName = new ArrayList<>();

	void setSchoolName(ArrayList<School> schoolName) {
		Main.schoolName = schoolName;
	}

	public ArrayList<School> getSchoolName() {
		return schoolName;
	}
	private static void printFibonacci(int i) {
		// TODO Auto-generated method stub
		
	}
	
//	    @Override
//		protected void finalize() throws Throwable{
//	    	super.finalize();
//	    	System.out.println("object Deleted");
//	    }
	
	
	
	public static void main(String[] args) throws Throwable
	{
//	Student studentList = new Student();
//	Course newCourse = new Course();
//	Marks newMarks = new Marks();
		
//		for (int i=0;i<1000000;i++) {
//			Main mi=new Main();
//		}
//		
		
		
		
		
         FileOutputStream fileOut;
         ObjectOutputStream fout = null ;
  
	     try {
	    	 fileOut=new FileOutputStream("C:\\Users\\User006\\eclipse-workspace\\israsaif\\isra.txt");
	    	 fout=new  ObjectOutputStream(fileOut);
	     }catch(IOException e1) {
	    	 e1.printStackTrace();
	     }
	    	 
	    	 

	    	 
	    	 
		ArrayList<School> schoolName1 = new ArrayList<>();
		Stack<String> history = new Stack<String>();
		Scanner sa = new Scanner(System.in);
		ArrayList<String> emailList = new ArrayList<>();
		HashSet<String> eList = new HashSet<>();
		
		Map<String ,Double> currancyAndAmount=new HashMap();
		Map<String,Map<String,Double>>StudentcurrancyAndAmount=new  HashMap<>();
		BigInteger fact=new BigInteger("1");
		int w;
		
		int n1=0,n2=1,n3=0,count=10;
		
		
		
		
		boolean eExit = true;
		boolean isExit = true;
		boolean hasExit = true;
		String name=" ";
		int currancy=0;
		double amount=0;
		double calculater=0;
		boolean backMenue=true;
		boolean teacherExit=true;
		
		String teacherNameInput=null;
		String teacherIdInput=null;
		String teacherName="ISRA";
		String teacherId="123";
		
		Student studentList = new Student();
		int studentAgeInput;
		
		
		while(teacherExit) {
			try {
				System.out.println("Enter techer name:");
				teacherNameInput=sa.next();
				if(teacherNameInput.matches("^[A-Za-z]*$"))
				{
					System.out.println("Faild String format");
			   }
				else 
				{
				System.out.println(" not faild String format");
				teacherExit=true;
			}
			}
			catch(NumberFormatException e) 
			{
				System.out.println("not faild string format");
				teacherExit=true;
			//	System.out.println("Enter teacher name:");
				//teacherNameInput=sa.next();
			}
		
			try 
			{
				System.out.println("Enter teacher Id:");
				teacherIdInput=sa.next();
				Integer.parseInt(teacherIdInput);
				System.out.println(" Faild number format");
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("Not  faild number format");
				teacherExit=true;
			}
			
			
			
			
		
		if(teacherNameInput.matches(teacherName)){
			if(teacherIdInput.equals(teacherId)){
		do {

			System.out.println("1.Enter Student detetls:");
			System.out.println("2. Report:");
			System.out.println("3. History:");
			System.out.println("4. Dublicate:");
			System.out.println("5. student amount:");
			System.out.println("6.code problem:");
			
			String bb = sa.next();
			int option = Integer.parseInt(bb);
			switch (option) {
			case 1:

				while (eExit) {
					School ourSchool = new School();
					System.out.println("Enter School Name:");
					String school = sa.next();
					ourSchool.setSchoolName(school);
					history.push(school);
					try {
						if(!school.matches("^[A-Za-z]*$")) {
							throw new Exception ("In Faild string formal");
						}
					}catch(Exception e) {
						System.out.println(e.getMessage());
						continue;
					}
					
					
					isExit = Boolean.TRUE;
					

					while (isExit) {
						studentList.finalize();
						System.out.println("Enter Student age:");
						studentAgeInput = sa.nextInt();
						studentList.setStudentAge(studentAgeInput);
						studentList.studentAge(studentAgeInput);
						
						if(studentAgeInput>6&&studentAgeInput<18) {
							System.out.println("can join to school");
						
						
						
						
						
						
						System.out.println("Enter Student Name:");
						String student = sa.next();
						studentList.setStudentName(student);
						history.push(student);
						try {
							if(!student.matches("^[A-Za-z]*$")) {
								throw new Exception ("In Faild string formal");
							}
						}catch(Exception e) {
							System.out.println(e.getMessage());
							continue;
						}
						
					
						System.out.println("Enter Student email:");
						String s = sa.next();
						studentList.setStudentEmail(s);
						history.push(s);
						eList.add(s);
						try {
							if(!s.matches("^[A-Za-z]*$")) {
								//throw new Exception ("In Faild string formal");
						//	}
							//else 
						//	{
							//if "(^[^666000]{3})-([0-9]{2})-([0-9]{4}$)" != null);
							}
						}catch(Exception e) {
							System.out.println(e.getMessage());
							continue;
						}
						
					boolean currancyExit =true;
					
					
						while (currancyExit) {
						System.out.print("select one option\n 1-Dollar\n 2-SAR\n 3-AED\n " );
			            currancy=sa.nextInt();
						System.out.println("enter your amount:");
						amount=sa.nextDouble();
						if(currancy==1) {
							name="Dollar";
							calculater=amount*2.6;
							System.out.println("AMOUNT in Dollar:\n"+calculater);
						}else if
							(currancy==2) {
							name="SAR";
							calculater=amount*9.7;
							System.out.println("AMOUNT In SAR:\n"+calculater);
						}else if(currancy==3) {
							name="AED";
						    calculater=amount*9.9;
						    System.out.println("AMOUNT IN AED:\n"+calculater);
						}else {
							if(currancy>4) {
								currancy=0;
								
							currancyExit =false;
							System.out.print("pls select one option");
							
							int curuser=sa.nextInt();
							if (curuser==0) {
							
								
						}
					}
						}
							currancyAndAmount.put(name, calculater);
							StudentcurrancyAndAmount.put(student,currancyAndAmount);	
							System.out.println("if you want add currancy press1,otherwise presso");
							int usercurrencyinput = sa.nextInt();
							if(usercurrencyinput == 0)
							{
								currancyExit = false;
							}
						}
						
						hasExit = Boolean.TRUE;

						while (hasExit) {
							
					
							Course newCourse = new Course();
							Marks newMarks = new Marks();
							newCourse.finalize();
							System.out.println("Enter Course Name:");
							String courseList = sa.next();
							newCourse.setCourseName(courseList);
							history.push(courseList);

							System.out.println("Enter course Mark:");
							String coursemar = sa.next();
							int m = Integer.parseInt(coursemar);
							newMarks.setCourseMarks(m);
							history.push(coursemar);
						//	try {
								fout.writeObject(history.toString());
							//} catch (IOException e) {
								// TODO Auto-generated catch block
							//	e.printStackTrace();
						//	}
							studentList.ourCourse.add(newCourse);
							newCourse.ourMarks.add(newMarks);

							System.out.println("do you want to add course press 1 if not press 0");
							int exitoutput = sa.nextInt();
							if (exitoutput == 0) {
								hasExit = false;
							}
							}
						
						schoolName.add(ourSchool);
						ourSchool.studentName.add(studentList);

						System.out.println("do you want to add student press 1");
						int studentExit = sa.nextInt();
						if (studentExit == 0) {
							isExit = false;
						}else {
							isExit=true;
							currancyExit=true;
							hasExit=true;
						}
						}else {
							System.out.println("can not join to school");
							
						}
					}
					System.out.println("do you want to add school press 1 ");
					int schoolExit = sa.nextInt();
					if (schoolExit == 1) {
						eExit = true;
						isExit = true;
						hasExit = true;
					} else {
						eExit = false;
						isExit = false;
						hasExit = false;
					}
				
					}
		            break;
		
			case 2:
                   
				System.out.println("******************REPORT*******************");

				for (School s : schoolName) {
					System.out.println("\tschool Name: \t" + "\t" + s.schoolName);

					for (Student t : s.studentName) {
						System.out.println("\tstudent Name:\t" + "\t" + t.studentName + "\tstudentEmail:\t" + "\t"
								+ t.studentEmail);

						for (Course c : t.ourCourse) {
							System.out.println("\tcourse Name:\t" + "\t" + c.courseName);

							for (Marks m : c.ourMarks) {
								System.out.println("\tMark: \t" + "\t" + "\t" + m.getCourseMark());
							}
						}
					}
				}
				break;
			case 3:
				//history
				while (history.empty() == false) {
					System.out.println(history.pop());
				}
				break;
			case 4:
				
				//duplicate
				for (String f : eList) {
					if (eList.add(f) == false) {
			System.out.println("duplicate email:\n" + f);
					}
				}
				break;
				
			case 5:
				// Currency Report
				for(String studentCurrency: StudentcurrancyAndAmount.keySet())
				{
					Map<String ,Double> lowerMap = StudentcurrancyAndAmount.get(studentCurrency);
					System.out.println("Student Name is : \t"+studentCurrency);
					for(String currencyKey: lowerMap.keySet())
					{
						System.out.println("Currency is : \t"+currencyKey+"\t Amount Is: \t"+lowerMap.get(currencyKey));
					}
				}
				break;
			
			case 6:
				do {
					System.out.println("\n1-new menue");
					System.out.println("2-fibonacci");
					System.out.println("-back to main menue");
					String smenue = sa.next();
					int menue = Integer.parseInt(smenue);
					switch (menue) {
					case 1:
						System.out.println("enter your number:");
						w = sa.nextInt();
			         for(int i=1;i<=w;i++) {
			        fact=fact.multiply(BigInteger.valueOf(i));
					}
					System.out.println("THE FACTORIAL OF NUMBER:\t"+"\t"+w+"\t"+"is\t"+fact);
					
					break;
					
					case 2:
						System.out.println("enter your count number:");
						count = sa.nextInt();
						System.out.print(n1+" "+n2);
						printFibonacci(count-2);
						for(int i=2;i<count;++i) {
							n3=n1+n2;
							n1=n2;
							n2=n3;
							System.out.print(" "+n3);
							printFibonacci(count-1);		
					          	}
				            break;
				
					case 3:
						backMenue=false;
						break;
				
				
				
				
				
				
				
					}
				}while (backMenue==true);
						
						
						
						
						
						
						
				break;
			}
				
						
			}while (true);
			}}else {
				System.out.println("your techer name and teacher id are wrong pls try again");
		}
		}teacherExit=true;
		
	


	}

}
