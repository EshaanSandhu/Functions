import java.util.Scanner;
class Third
{
public static void main( String args[])
{
int r,sum=0,temp;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Palindrome number");
int a = scanner.nextInt();
temp=a;
for(;a!=0;a/=10)
{
r=a%10;
sum=(sum*10)+r;
}
if(sum==temp)
{
System.out.println("It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
}
}