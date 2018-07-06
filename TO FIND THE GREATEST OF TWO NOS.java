package greatest_num;
import java.util.Scanner;
public class greatest_of_two_num {
public static void main(String aa[]) {
int num1;
int num2;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
if(num1&gt;num2)
{
System.out.println(num1);
}
else if(num1==num2)
{
System.out.println(&quot;equal&quot;);
}
else
{
System.out.println(num2);
}

}
}
