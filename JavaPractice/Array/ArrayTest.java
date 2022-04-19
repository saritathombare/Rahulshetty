package Array;

import java.util.Arrays;
import java.util.List;

public class ArrayTest 
{
	/**
	 
	 * Java program to check if an Array contains an Item or not and finding index of that item. 
	 * For example, How to check if a String array contains a particular String or not and What is
	 * index of that String in Java program.
	 */
	

	    public static void main(String args[])
	    {
	 
	      String[] programming = new String[]{"Java", "C++", "Perl", "Lisp"};
	   
	      // Checking an String in String Array by converting Array To ArrayList
	      List<String> programmingList = Arrays.asList(programming);
	   
	      //Checking does this Array contains Java
	      boolean result = programmingList.contains("Java");
	   
	      System.out.println("Does programming Array contains Java? " + result);
	   
	      int index = programmingList.indexOf("Java");
	   
	      System.out.println("Index of Java in programming Array is : " + index);
	   
	    }
	     
	}


	


