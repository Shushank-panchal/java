package CoreJava;
import java.util.Scanner;
class MultiDimensional_AirthmeticArray
{
public static void main(String[] args) 
{
int a,b;
Scanner sc = new Scanner(System.in);

//Size of array
System.out.println("Enter the number of Rows in 1st matrix : ");
a = sc.nextInt();
System.out.println("Enter the number of columns of 1st matrix : ");
b = sc.nextInt();
int arr[][] = new int[a][b];
int crr[][] = new int[a][b];
int aaa[][] = new int[a][b];	
System.out.println("Enter the Elements of 1st matrix : ");
for(int i = 0;i<a;i++)
{
for(int j=0;j<b;j++)
{
arr[i][j]= sc.nextInt();
System.out.println();
}
}
System.out.println("Enter the Elements of Second matrix : ");
for(int i = 0;i<a;i++)
{
for(int j=0;j<b;j++)
{
crr[i][j]= sc.nextInt();
System.out.println();
}
}
System.out.println("Sum of Two matix : ");
for(int i =0;i<a;i++)
{
for(int j=0;j<b;j++)
{
aaa[i][j]=arr[i][j]+crr[i][j];
}
}
for(int i = 0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.print(aaa[i][j]+" ");
}
System.out.println();
}
System.out.println("Substraction of Two matix : ");
for(int i =0;i<a;i++)
{
for(int j=0;j<b;j++)
{
aaa[i][j]=arr[i][j]-crr[i][j];
}
}
for(int i = 0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.print(aaa[i][j]+" ");
}
System.out.println();
}System.out.println("Multiplication of Two matix : ");
for(int i =0;i<a;i++)
{
for(int j=0;j<b;j++)
{
aaa[i][j]=arr[i][j]*crr[i][j];
}
}
for(int i = 0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.print(aaa[i][j]+" ");
}
System.out.println();
}
sc.close();
}
}
