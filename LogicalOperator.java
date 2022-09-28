package CoreJava;
import java.util.Scanner;
class LogicalOperator {
public static void main(String[] args) {
//Creating Scanner class to take input from user
Scanner sc = new Scanner(System.in);
//getting input value from the user
System.out.println("Enter the first number : ");
int num1 = sc.nextInt();
System.out.println("Enter the Second Number : ");
int num2 = sc.nextInt();
System.out.println("Enter the Third Number : ");
int num3 = sc.nextInt();
//using Logical And to verify Two constraints
System.out.println("Performing Logical AND");
if((num1<num2)&&(num2==num3))
{
int sum = num1+num2+num3;
System.out.println("The sum is : "+sum);
}
else
System.out.println("False Condition : ");
//using Logical OR to verify Two Constraints
System.out.println("Performing Logical OR");
if((num1<num2)||(num2==num3))
{
int sum = num1+num2+num3;
System.out.println("The sum is : "+sum);
}
else
System.out.println("Both Condition are False : ");
//Performing Not Operator
System.out.println("Performing Not Operator");
System.out.println(" ! (num1<num2) ="+!(num1<num2));
System.out.println("!(num2>num3) = "+!(num2>num3));
}
}
