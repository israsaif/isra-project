package first;

import java.util.ArrayList;
public class Course {
  ArrayList<Marks> ourMarks=new ArrayList<>();

  void setOurMarks(ArrayList<Marks>ourMarks) {
  this.ourMarks=ourMarks;
 }
  public ArrayList<Marks>getOurCourse(){
  return ourMarks;
 }


  String courseName;

  void setCourseName (String a) {
  this.courseName=a;
 }
 String courseName() {
 return courseName;
  }

 }

