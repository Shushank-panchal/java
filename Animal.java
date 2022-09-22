class Animal
{
//methods and fields
 String name;
public void eat()
{
    System.out.println("i can eat"); 
}
}
//use of extends keyword to perform inheritance
class Dog extends Animal
{
//methods and fields of Animal
//methods and fields of dog
public void display()
{
System.out.println("my name is : "+name);
}
public static void main(String[] args)
{
//creating an object of subclass
Dog d = new Dog();
//acessing fields of super class
d.name ="german shefard";
d.display();
//call method of super class using object of subclass
d.eat();
}
}