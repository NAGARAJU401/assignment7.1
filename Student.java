package Package1;

import java.io.IOException;
import java.util.*;
public class Student {

	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
		//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

		 private String name ="Nagaraju";
		 private int rollno = 1;
		 public void accept ()throws IOException{
			 Scanner sc =new Scanner(System.in);
			 System.out.println("enter name: "+name );
			//system is used to return code
				//out is a static number
			   //Println is used to print text student name and gives output

			 name=sc.toString();
			 System.out.println("rollno: "+rollno );
			//system is used to return code
				//out is a static number
			   //Println is used to print text student name and gives output

			 rollno=sc.nextInt();
		 }
	}


	/* class Demo{
	 
	 public static void main(String []args) throws IOException{
		 
		 Student s =new Student();
		 s.accept();
		 
	 }*/