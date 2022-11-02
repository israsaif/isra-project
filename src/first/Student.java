package first;

import java.util.ArrayList;

public class Student implements studentInterface{
	 ArrayList<Course> ourCourse=new ArrayList<>();
	 String studentName;
	 String studentEmail;
	 float studentAmount;
   	int studentAge;
	

 
  void setOurCourse(ArrayList<Course>ourCourse) {
  this.ourCourse=ourCourse;
 }
  public ArrayList<Course>getOurCourse(){
  return ourCourse;
 }

    
   
   
    void setStudentName(String a) {                                       
  
    this.studentName=a;              
   
    }
   
   String getStudentName () {                      
   return studentName;                                                             
   }
   
   
   
   

   void setStudentEmail(String b) {
   this.studentEmail=b;
   }
   String getStudentEmail() {
	   return studentEmail;
	   }
  

  void setStudentAmount(float b) {
  this.studentAmount=b;
  }
  float getStudentAmount() {
	   return studentAmount;
	   }

 void setStudentAge(int q) {
	   this.studentAge = q;
	   }
	   int getStudentAge() {
		   return studentAge;
		   }
  
  
  
  
@Override
public void studentAge(int studentAgeInput) {}
//	if(studentAgeInput>6&&studentAgeInput<18) {
//		System.out.println("can join to school");
//	}else {
//		System.out.println("can not join to school");
//		
//	}
//}


}