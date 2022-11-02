/*
 * Vector :-The Vector in Java is a class that implements a dynamic array.
 *  This means we can increase or decrease the size of the array dynamically.
 */
package Collections;
import java.util.Vector;
class Vector_Ex
{
public static void main(String[] args)
{
Vector<String> obj = new Vector<String>();
//Using the add method add the values through objects 
obj.add("Abcd");
obj.add("efgh");
//using index number
obj.add(2,"ijkl");
System.out.println("Vector : "+obj);
//using add all methods 
Vector<Integer> a = new Vector<Integer>();
a.add(5);
a.add(6);
System.out.println("Vector : "+a);
//using remove methods to remove Elements 
String ob = obj.remove(2);
System.out.println("Removed Element is : "+ob);
System.out.println("New Vector is : "+obj);
//using Clear method
obj.clear();
System.out.println("Vector After : "+obj);
}
}
