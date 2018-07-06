import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Most_fre_digit {
public static void main(String[] args) {
int n,cnt=0,max=0;
String s=&quot; &quot;;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i&lt;n;i++)
{
a[i]=sc.nextInt();
s=s+a[i];
}
char b[]=s.toCharArray();
int l=b.length;
Arrays.sort(b);
char v=&#39; &#39;;
for(int i=0;i&lt;l;i++)
{

for(int j=i+1;j&lt;l;j++)
{
if(b[i]==b[j])
{ cnt++;
b[j]=&#39;*&#39;;
}
}
if(max&lt;=cnt)
{
max=cnt;
v=b[i];
}
cnt=0;
}
System.out.println(v);
}
}
