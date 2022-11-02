/*
 * Priority_Queue :-It is a type of Queue wherein all the Elements are ordered as per their orderin
 * and each element is associated with priority.
 */
package Collections;
//import java.util.Iterator;
import java.util.PriorityQueue;
class Priority_Queue 
{
public static void main(String[] args)
{
PriorityQueue<Integer> num = new PriorityQueue<>();
num.add(100);
num.add(200);
num.add(500);
num.add(700);
System.out.println("Priority Queue : ");
//iterator method : traverse
//hasnext(): boolean (true/false) 1.true,2.true,3.false
//next(): iterator
//Iterator<Integer> iterate = num.iterator();
//while(iterate.hasNext())
while(!num.isEmpty())
{
	//System.out.println(iterate.next());
	//System.out.println(" , ");
	System.out.println(num.remove());//deque
}
}
}
