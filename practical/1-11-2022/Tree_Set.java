/*
 * Implementation of Binary search tree.
 * A sorted collection.
 * Stores unique elements.
 */
package Collections;
import java.util.*;
class Tree_Set
{
public static void main(String[] args)
{
TreeSet<String> obj = new TreeSet<>();
obj.add("Ravi");
obj.add("Shushank");
obj.add("sushma");
obj.add("yash");
//Traversing elements
System.out.println("Elements in Order:");
Iterator<String> itr=obj.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println();
System.out.println("Elements in Descending Order:");
//To print in descending order
Iterator<String> itr1=obj.descendingIterator();
while(itr1.hasNext())
{
System.out.println(itr1.next());
}
}
}
