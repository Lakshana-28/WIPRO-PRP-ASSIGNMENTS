package add_two_string_numbers;
import java.util.Scanner;
public class Add_two_string_numbers {
public static void main(String[] args) {
String a,b;
int sum=0,sum1=0;
int x=48;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
b=sc.nextLine();
char c[]=a.toCharArray();
int l1=c.length;
char d[]=b.toCharArray();
int l2=d.length;
for(int i=0;i&lt;l1;i++)
{
int t=(int)c[i];
sum=(sum*10)+(t-x);
}
for(int i=0;i&lt;l2;i++)
{
int q=(int)d[i];
sum1=(sum1*10)+(q-x);
}
System.out.println(sum+sum1);
}
}
