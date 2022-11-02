/*
 * It is a Way to apply resizable_array
 * in addition to the implementation of the deque interface
 */
package Collections;
import java.util.*;
class Array_Deque
{
public static void main(String[] args)
{
Deque<String> deque = new ArrayDeque<String>();
deque.add("apple");
deque.add("banana");
deque.add("mango");
for(String s:deque)
{
System.out.println(s);
}
//deque.polllast() - returns the last element from the deque
deque.pollLast();
System.out.println("After PollLast() : ");
for(String s:deque) 
{
	System.out.println(s);
}
}
}
