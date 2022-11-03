package first;

import java.util.ArrayList;
public class Course {
	
	 protected void finalize() throws Throwable
	    {
	        try {
	 
	            System.out.println("inside demo's finalize()");
	        }
	        catch (Throwable e) {
	 
	            throw e;
	        }
	        finally {
	 
	            System.out.println("Calling finalize method"
	                               + " of the Object class");
	 
	            // Calling finalize() of Object class
	            super.finalize();
	        }
	    }
	
	
	
	
	
	
	
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

