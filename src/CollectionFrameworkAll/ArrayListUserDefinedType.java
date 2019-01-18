package CollectionFrameworkAll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUserDefinedType {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "Shakib", 14);     // Creating user-defined class objects													  
		Student s2 = new Student(1002, "Rahim", 18);
		Student s3 = new Student(1003, "Tamim", 13);
		ArrayList<Student> al = new ArrayList<Student>(); // creating Arraylist
		al.add(s1);                                       // adding Student class object
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();                     // Getting Iterator
		while (itr.hasNext()) {                           //traversing elements of ArrayList object 
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("........Enhanced For Loop using:.........");
		 for(Student b:al){  
		        System.out.println(b.rollno+" "+b.name+" "+b.age);  
		    }  
	}

}
