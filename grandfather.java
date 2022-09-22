class grandfather
{
public void property()
{
System.out.println("head of the family");
}
}
class father extends grandfather
{
public void display()
{
System.out.println("He is a Teacher");
}
}
class child extends father
{
public void show()
{
System.out.println("He is a Student");
}
public static void main(String[] args)
{
child obj = new child();
obj.property();
obj.display();
obj.show();
}
}