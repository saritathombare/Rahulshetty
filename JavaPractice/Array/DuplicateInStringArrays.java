package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInStringArrays
{
	public static void main(String[] args) 
	{
		 
        // String Arrays
        String[] strArrays = {"Cabbage","Kale","Radish","Onions","Garlic","Beetroot","Cucumber","Carrot","Kale"};
        
        
        
//        Create String Arrays consisting few duplicate element/objects
//        First convert String Arrays into List
//        And then convert List into Set, as directly converting String Arrays to Set is not possible
//        Get length of String Arrays using length property of Arrays
//        Similarly get size of Set/HashSet object using size() method
//        Finally compare Arrays length with Set size using if-else statement
//        If String Arrays length is greater-than HashSet size then there are duplicate element/objects are present in original String Arrays
//        Else, there are NO duplicate present
 
        // First convert to List
        List<String> list = Arrays.asList(strArrays);
 
        // Then convert to Set
        Set<String> set = new HashSet<String>(list);
 
        // check String Arrays length and HashSet size
        int strArrayLength = strArrays.length;
        int setSize = set.size();
 
        if(strArrayLength >= setSize) 
        {
            System.out.println("Duplicate element/objects" + " present in original String Arrays");
        }
        else 
        {
            System.out.println("There are NO duplicates" + " in original String Arrays");
        }
        
	}

}
