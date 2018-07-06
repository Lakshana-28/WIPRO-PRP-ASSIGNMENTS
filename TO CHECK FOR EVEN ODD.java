package evenodd;
import java.util.Scanner;
public class even_odd {
public static int eveodd(int a)
{
if(a%2==0)
{
return 2;
}
else
{
return 1;
}
}
public static void main(String aa[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int res=eveodd(num);
System.out.println(res);
}
}
