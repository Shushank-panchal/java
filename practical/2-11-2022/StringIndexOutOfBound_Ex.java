package Exception_Handling;
class StringIndexOutOfBound_Ex 
{
public static void main(String[] args)
{
try 
{
	String arr = "Money";
	//arr[4]="aman";
	//arr[5] ="Shivani";
	System.out.println(arr.charAt(9));
}
catch(StringIndexOutOfBoundsException ae)
{
	System.out.println("String Index out of Bound Exception Handled =>" +ae.getMessage());
}
}
}
