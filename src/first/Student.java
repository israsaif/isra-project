package first;

import java.util.ArrayList;

public class Student {

  ArrayList<Course> ourCourse=new ArrayList<>();
  void setOurCourse(ArrayList<Course>ourCourse) {
  this.ourCourse=ourCourse;
 }
  public ArrayList<Course>getOurCourse(){
  return ourCourse;
 }

    String studentName;
   
   
    void setStudentName(String a) {
    this.studentName=a;
   
    }
   
   String getStudentName () {
   return studentName;
   }
   
   
   String studentEmail;
   

   void setStudentEmail(String b) {
   this.studentEmail=b;
   }
   String getStudentEmail() {
	   return studentEmail;
	   }
  float studentAmount;

  void setStudentAmount(float b) {
  this.studentAmount=b;
  }
  float getStudentAmount() {
	   return studentAmount;
	   }

}