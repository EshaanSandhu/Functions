import java.util.Scanner;
class Secondary{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
int sum;
System.out.println("Enter Value A:");
int x = scanner.nextInt();
System.out.println("Enter Value B:");
int y = scanner.nextInt();
sum = getTotal(x,y);
System.out.println("Sum is"+sum);
}
public static int getTotal(int a, int b)
{
int sum=a+b;
return sum;
}
}
