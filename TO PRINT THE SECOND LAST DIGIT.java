package secondlast;
import java.util.Scanner;
public class second_last {
public static int sec_last(int a)
{
int arr[]=new int[100];
int k=0,cnt=0;
while(a!=0)
{
int i=a%10;
arr[k]=i;
k++;
a=a/10;
cnt++;
}
if(cnt&gt;1) {
return arr[1];
}
else {
return -1;
}
}
public static void main(String aa[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int res=sec_last(num);
System.out.println(res);
}
}
