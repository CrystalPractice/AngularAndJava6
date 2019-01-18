package CollectionFrameworkAll;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonoo"); 
		  al2.add("Vijay"); 
		  al2.add("Hanumat");
		  al.addAll(al2);
		  
		  for(String obj:al)  
			    System.out.println(obj);  
			 }  
	}
	

