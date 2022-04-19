package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrequencyOfDuplicateElement 
{
	public static void main(String[] args) {
		 
        // String Arrays
        String[] strArrays = {
                "Cabbage", 
                "Kale",
                "Radish",
                "Kale",
                "Garlic",
                "Ginger",
                "Garlic",
                "Carrot",
                "Kale"
        };
 
        // First convert to List
        List<String> list = Arrays.asList(strArrays);
 
        // just empty HashSet object
        // add converted List (Arrays -> List)
 
        Set<String> setVeg = new HashSet<String>(list);
 
        System.out.println("Element-Name\tFrequency");
        System.out.println("============\t==========");
 
        // Iterate using enhanced for-each loop
      
        for (String veg : setVeg) 
        {
            System.out.println(veg + "\t\t" + Collections.frequency(list, veg));
        }
    }

}
