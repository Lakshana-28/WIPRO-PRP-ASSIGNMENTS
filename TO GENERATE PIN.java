1)package pin_generation;
import java.util.Scanner;
public class Pin_generation {
public static void main(String[] args) {
int a,b,c,min=0;
int w=48;
String p=&quot; &quot;;
String q=&quot; &quot;;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
q=q+a+b+c;
char m[]=q.toCharArray();
int l=m.length;
char max=m[0];
for(int i=1;i&lt;l;i++)
{
if(max&lt;m[i])
{
max=m[i];
}
}
int t=(int)max;
int max1=t-w;

while(a!=0&amp;&amp;b!=0&amp;&amp;c!=0)
{
int a1=a%10;
int b1=b%10;

int c1=c%10;
if(a1&lt;=b1&amp;&amp;a1&lt;=c1)
{
min=a1;
}
else if(b1&lt;=a1&amp;&amp;b1&lt;=c1)
{
min=b1;
}
else
{
min=c1;
}
p=p+min;
a=a/10;
b=b/10;
c=c/10;
}
System.out.print(max1);
StringBuilder sb=new StringBuilder(p);
System.out.print(sb.reverse());
}

}
