package addition;

import java.util.Scanner;
public class sum_number {
public static int sum(int a,int b)
{
int sum=0,sum1=0;
while(a!=0)
{
int i=a%10;
sum=i;
break;
}
while(b!=0)
{
int i=b%10;
sum1=i;
break;
}
return Math.abs(sum)+Math.abs(sum1);
}
public static void main(String aa[])
{
int num1,num2;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
int res=sum(num1,num2);
System.out.println(Math.abs(res));

}
}
