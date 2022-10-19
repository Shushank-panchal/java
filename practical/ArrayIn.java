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
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<a;i++) {
sum = sum+arr[i];	
}
System.out.println("Sum of all the array elements :"+sum);
sc.close();
}
}
