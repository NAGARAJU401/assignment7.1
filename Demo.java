package Package2;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
import java.io.IOException;

import Package1.Student;

class Demo {
	//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String []args) throws IOException{
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 Student s =new Student();
		 s.accept();
		 
	 }

}
