package first;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
	ArrayList<School> schoolName = new ArrayList<>();

	void setSchoolName(ArrayList<School> schoolName) {
		this.schoolName = schoolName;
	}

	public ArrayList<School> getSchoolName() {
		return schoolName;
	}
	//factorial
	public static int factorialReoursionMethod(int n) {
		
		int multiply=1;
		
		if(n==1)
		{
			return n;
		}else {
			return n * factorialReoursionMethod(n-1);
			}
		}
	
	
	public static void main(String[] args) {

		ArrayList<School> schoolName = new ArrayList<>();
		Stack<String> history = new Stack<String>();
		Scanner sa = new Scanner(System.in);
		ArrayList<String> emailList = new ArrayList<>();
		HashSet<String> eList = new HashSet<>();
		
		Map<String ,Double> currancyAndAmount=new HashMap();
		Map<String,Map<String,Double>>StudentcurrancyAndAmount=new  HashMap<>();
		
		
		
		boolean eExit = true;
		boolean isExit = true;
		boolean hasExit = true;
		String name=" ";
		int currancy=0;
		double amount=0;
		double calculater=0;


		do {

			System.out.println("1.Enter Student detetls:");
			System.out.println("2. Report:");
			System.out.println("3. History:");
			System.out.println("4. Dublicate:");
			System.out.println("5. student amount:");
			System.out.println("6.factorayal:");
			
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
					
					isExit = Boolean.TRUE;
					

					while (isExit) {
						Student studentList = new Student();
						System.out.println("Enter Student Name:");
						String student = sa.next();
						studentList.setStudentName(student);
						history.push(student);
						System.out.println("Enter Student email:");
						String s = sa.next();
						studentList.setStudentEmail(s);
						history.push(s);
						eList.add(s);
						
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
							System.out.println("Enter Course Name:");
							String courseList = sa.next();
							newCourse.setCourseName(courseList);
							history.push(courseList);

							System.out.println("Enter course Mark:");
							String coursemar = sa.next();
							int m = Integer.parseInt(coursemar);
							newMarks.setCourseMarks(m);
							history.push(coursemar);
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
		           } break;
		
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
				
				System.out.println("Factoral using recurssion method:-");
				System.out.println("Enter factoral number :");
				int factoralNo=sa.nextInt();
				System.out.println("multiplication factoral= "+factorialReoursionMethod(factoralNo));
				break;
			
				
			}
	
		} while (true);

	}
}


