/*
 * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
 * Array list :-the array list implements list interface and it uses a dynamic array to store the duplicate elements of different datatypes
 */
package Collections;
import java.util.*;
class Array_list
{
public static void main(String[] args)
{
ArrayList<Integer> obj = new ArrayList<Integer>();  //creating array_list
{
	//adding object in Arraylist
	obj.add(4);
	obj.add(6);
	obj.add(4);
	//System.out.println(obj);
	Iterator<Integer> obj2 = obj.iterator();
	while (obj2.hasNext())
	{
		System.out.println(obj2.next());
	}
}
}
}
