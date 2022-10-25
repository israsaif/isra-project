package first;

public class Marks {
  // in this class only add properties
  int courseMark;
  void setCourseMarks (int courseMarks) {
  if(courseMarks>0&& courseMarks<100) {
  this.courseMark=courseMarks;
  }else {
  System.out.println("pls enter marks between 0,100");
  }
 }
   int getCourseMark() {
   return courseMark;
  }

 }