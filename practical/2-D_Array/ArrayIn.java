/*
 * Program to input 10 numbers in an array and display only the even numbers if present in the array.
 */

package CoreJava;
import java.util.Scanner;
public class ArrayIn
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Array : ");
int a = sc.nextInt();
//declaring array
int arr[] = new int[a];
System.out.println("Enter the Elements : ");
//traversing The Array
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
//Traversing The Array
for(int i=0;i<a;i++) {
sum = sum+arr[i];	
}
System.out.println("Sum of all the array elements :"+sum);
sc.close();
}
}
