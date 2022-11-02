/*
 * linked list : linked list implements collection interface and it also stores duplicate data
 */

package Collections;

import java.util.Iterator;
import java.util.LinkedList;
public class Linked_List
{
public static void main(String[] args) 
{
LinkedList<Integer> obj = new LinkedList<Integer>();  //creating Linked_list
{
//adding object in Linkedlist
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
