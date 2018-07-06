package addnonprimeindices;
import java.util.Scanner;
public class add_non_prime_indices {
public static void main(String aa[])
{
int cnt=0,sum=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i&lt;n;i++)
{
a[i]=sc.nextInt();

}
for(int i=0;i&lt;=n;i++)
{
for(int j=1;j&lt;=n;j++)
{
if(i%j==0)
{
cnt++;
}
}
if(cnt&gt;2)
{
sum=sum+a[i];
}
cnt=0;
}
System.out.println(sum+a[1]);
}
}
