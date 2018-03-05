import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
int a,f=0,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
a=s.nextInt();
for(i=2;i<a;i++)
{
if(a%i==0)
{
System.out.println(a+" is not a prime number.");
f=1;
break;
}
}
if(f==0)
{
System.out.println(a+" is a prime number.");
}
}}
