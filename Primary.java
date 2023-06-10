import java.util.Scanner;
class Primary{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter First Value");
int a = scanner.nextInt();
System.out.println("Enter Second Value");
int b = scanner.nextInt();
System.out.println("Enter Third Value");
int c = scanner.nextInt();
if(a<b)
{
if(c<a)
System.out.println("C is Smallest"+ c);
else
System.out.println("A is Smallest"+ a);
}
else
{
if(b<a)
System.out.println("B is Smallest"+ b);
else
System.out.println("A is Smallest"+ a);
}
}
}



 
