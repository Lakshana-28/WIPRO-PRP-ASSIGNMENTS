package lastdigit;

import java.util.Scanner;
public class last_digit {
public static int lastdigi(int a)
{
int n=a%10;
return n;
}
public static void main(String aa[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int res=lastdigi(num);
System.out.println(Math.abs(res));
}
}
