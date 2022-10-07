package CoreJava;

interface Shape1 
{
void getArea(int length, int breadth);
}
//implement the shape interface
class Rectangle implements Shape1
{
	//implementation of abstract methopd of interface Shape1
public void getArea(int length, int breadth)
{
	System.out.println("The area of Rectangle is : "+(length * breadth));
}
}
