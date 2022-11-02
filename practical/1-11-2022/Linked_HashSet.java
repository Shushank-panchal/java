/*
 * It is an ordered and sorted collection of hashset.
 * It also maintains the insertion order.
 */
package Collections;
import java.util.*;
import java.util.LinkedHashSet;

class Linked_HashSet
{
public static void main(String[] args)
{
LinkedHashSet<String> ob = new LinkedHashSet<>(); 
ob.add("a");
ob.add("b");
ob.add("c");
ob.add("d");
ob.add("e");
//traversing Elements 
Iterator<String> itr = ob.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
