package first;


import java.util.ArrayList;

public class School
 {
  ArrayList<Student> studentName=new ArrayList<>();
  void setStudentName(ArrayList<Student>studentName) {
  this.studentName=studentName;
 }
  public ArrayList<Student>getStudentName(){
  return studentName;
 }
  String schoolName;
  void setSchoolName(String schoolName) {
  this.schoolName=schoolName;
 }
  String getSchoolName() {
  return schoolName;
 }

  public static void main(String[] args) {

  }
 }

