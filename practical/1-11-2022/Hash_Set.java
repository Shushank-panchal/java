/*
 * The Elements are stored by using hashing
 * contains unique Elements 
 * Allows null Value
 * order in Ascending order
 */
package Collections;
import java.util.*;
public class Hash_Set
{
public static void main(String[] args)
{
HashSet<String> ob = new HashSet<>();
ob.add("madhu");
ob.add("shalini");
ob.add("shani");
ob.add("anirudh");
//traversing Elements Iterator
Iterator<String> itr = ob.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
