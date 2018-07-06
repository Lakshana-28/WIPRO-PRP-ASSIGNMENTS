package evn.or.odd.sum;
import java.util.Scanner;
public class EvnOrOddSum {
public static void main(String[] args) {
int a;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int sum=a+b;
if(sum%2==0)
{
System.out.println(&quot;even&quot;);
}
else
{
System.out.println(&quot;odd&quot;);
}
// TODO code application logic here
}
}
