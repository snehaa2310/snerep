import java.util.Scanner;
 
public class Student {
 
 int stuid;
 String name;
 String dept;
 float cgpa;
 int contact;
 String mailid;
 public void getInput() 
 {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the student id :: ");
  stuid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the Department :: ");
  dept = in.next();
  System.out.print("Enter CGPA :: ");
  cgpa=in.nextFloat();
  System.out.print("Enter Contact Number :: ");
  contact=in.nextInt();
  System.out.print("Enter Mail id :: ");
  mailid=in.next();
 }
 
 public void display() {
  
  System.out.println("ID = " + stuid);
  System.out.println("NAME = " + name);
  System.out.println("DEPARTMENT = " + dept);
  System.out.println("CGPA = "+cgpa);
  System.out.println("PHONE NUMBER ="+contact);
  System.out.println("MAIL ID = "+mailid);
 }
 
 public static void main(String[] args) 
 {
	 int n;
	 Scanner inn = new Scanner(System.in);
	 System.out.println("Enter total no. of Students");
	 n=inn.nextInt();
 
  Student s[] = new Student[n];
  
  for(int i=0; i<n; i++) {
   
   s[i] = new Student();
   s[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<n; i++) {
   
   s[i].display();
  }
 }
}
