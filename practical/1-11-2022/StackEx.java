/*
 * Stack :-
 */
package Collections;
import java.util.Stack;
class StackEx
{
public static void main(String[] args)
{
Stack<Integer> obj = new Stack<Integer>();
obj.push(4);
obj.push(5);
obj.push(6);
System.out.println("the Stack is : "+obj);
obj.pop();
System.out.println("Stack After pop : "+obj);
}
}
